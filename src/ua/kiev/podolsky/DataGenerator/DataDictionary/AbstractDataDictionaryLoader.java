package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public abstract class AbstractDataDictionaryLoader implements DataDictionaryLoader{
	private Connection connection;

	public AbstractDataDictionaryLoader(Connection conn) {
		connection = conn;
	}
	
	protected Connection connection() {
		return connection;
	}
	
	protected ResultSet executeStatement(String sqlText) throws SQLException {
		Statement stmt = connection().createStatement();
		ResultSet rs = stmt.executeQuery(sqlText);
		return rs;
	}
	
	ResultSet rs;
	
	@Override
	public Iterable<DatabaseTable> loadTables() {
		try {
			rs = executeStatement(getSelectStatement());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Iterable<DatabaseTable>() {
			public Iterator<DatabaseTable> iterator() {
				return new Iterator<DatabaseTable> () {

					@Override
					public boolean hasNext() {
						try {
							return rs.isLast();
						} catch (SQLException e) {
							throw new RuntimeException(e);
						}
					}

					@Override
					public DatabaseTable next() {
    					return createTable(rs);
					}
				};
			}
		};
	}

	public abstract String getSelectStatement();
	
	public abstract DatabaseTable createTable(ResultSet rs);
	
	@Override
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
