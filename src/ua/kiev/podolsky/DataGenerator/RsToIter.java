package ua.kiev.podolsky.DataGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.function.Predicate;

import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;

public class RsToIter {

	public static void main(String[] args) {
		int i = 0;
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//vhgtestdb:1521/vhgtest", args[0],
				args[1]);
				ResultSet rs = conn.createStatement()
						.executeQuery("select owner, table_name from all_tables where rownum <= 10000")) {
			for (String s : RsToIter.<String>ResultSet2Iterable(rs,
					(ds) -> ds.getString("OWNER") + "." + ds.getString("TABLE_NAME"),
					(p) -> p.contains("IGORP."))
					) {
				System.out.println(++i + ": " + s);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main1(String[] args) {
		int i = 0;
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//vhgtestdb:1521/vhgtest", args[0],
				args[1]);
				ResultSet rs = conn.createStatement()
						.executeQuery("select owner, table_name from all_tables where rownum <= 100")) {
			for (String s : RsToIter.<String>ResultSet2Iterable(rs, new DataSet2Object<String>() {

				@Override
				public String createObject(ResultSet ds) throws SQLException {
					return ds.getString("OWNER") + "." + ds.getString("TABLE_NAME");
				}

			})) {
				System.out.println(++i + ": " + s);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public interface DataSet2Object<T> {
		T createObject(ResultSet rs) throws SQLException;
	}

	public static <T> Iterable<T>ResultSet2Iterable (ResultSet rs, DataSet2Object<T> objectCreator) {
		return ResultSet2Iterable(rs, objectCreator, p -> true);
	}
	
	public static <T> Iterable<T> ResultSet2Iterable(ResultSet rs, DataSet2Object<T> objectCreator, Predicate<T> filter) {
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {

					boolean hasNext;
					T currentObject;
					
					boolean hasNextFiltered() throws SQLException{
						while(rs.next()) {
							currentObject = objectCreator.createObject(rs);
							if (filter.test(currentObject)) return true;
						}
						return false;
					}

					{
						try {
							hasNext = hasNextFiltered(); // rs.next();
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
							res = currentObject; // objectCreator.createObject(rs);
							hasNext = hasNextFiltered(); // rs.next();
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
