package ua.kiev.podolsky.DataGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class DsToIter {

	public Iterable<String> iter() {
		return new Iterable<String>() {
			
			Connection conn = null;
			ResultSet rs = null;
			
			{
				try {
					conn = DriverManager.getConnection("jdbc:oracle:thin:@//vhgtestdb:1521/vhgtest", "igorp", "SkodaKodiaq#1");
					rs = conn.createStatement().executeQuery("select owner, table_name from all_tables where rownum <= 20");
				} catch (SQLException e) {
					try {
						if (conn != null) conn.close();
					} catch (SQLException e1) {
						throw new RuntimeException(e1);
					}
					throw new RuntimeException(e);
				}
			}

			@Override
			public Iterator<String> iterator() {
				return new Iterator<String> () {

					boolean hasNext;
					
					{ 
						try {
							hasNext = rs.next();
						} catch (SQLException e) {
							throw new RuntimeException(e);
						}
					}
					
					@Override
					public boolean hasNext() {
						return hasNext;
					}

					@Override
					public String next() {
						String res = "EOF";
						try {
							res = rs.getString("TABLE_NAME");
							hasNext = rs.next();
						} catch (SQLException e) {
							throw new RuntimeException(e);
						}
						return res;
					}
					
				};
			}
			
		};
		
	}
	
	public static void main(String[] args) {
		int i = 0;
		for(String s: (new DsToIter()).iter()) {
			System.out.println(++i + s);
		}
	}
	
	interface DataSet2Object<T> {
		T createObject(ResultSet ds);
	}
	
	public static <T> Iterable<T> DataSet2Iterable (ResultSet ds, DataSet2Object<T> objectCreator) {
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				return new Iterator<T> () {

					boolean hasNext;
					
					{ 
						try {
							hasNext = ds.next();
						} catch (SQLException e) {
							throw new RuntimeException(e);
						}
					}
					
					@Override
					public boolean hasNext() {
						return hasNext;
					}

					@Override
					public T next() {
						T res = null;
						try {
							res = objectCreator.createObject(ds);
							hasNext = ds.next();
						} catch (SQLException e) {
							throw new RuntimeException(e);
						}
						return res;
					}
				};
			}
		};
	}
}
