package ua.kiev.podolsky.DataGenerator.DataDictionary.MySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;

abstract class AbstractDataDictionaryLoader implements DataDictionaryLoader{
	private Connection connection;

	public AbstractDataDictionaryLoader(Connection conn) {
		connection = conn;
	}
	
	protected Connection connection() {
		return connection;
	}
	
	protected class TableIterable implements Iterable<DatabaseTable> {
		
		protected class TableIterator implements Iterator<DatabaseTable> {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public DatabaseTable next() {
				// TODO Auto-generated method stub
				return null;
			}
		}

		@Override
		public Iterator<DatabaseTable> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public boolean hasNext() {
			// return rs.
			return false;
		}
		
	}
	
	protected ResultSet rs;
	
	protected ResultSet executeStatement(String sqlText) throws SQLException {
		Statement stmt = connection().createStatement();
		rs = stmt.executeQuery(sqlText);
		return rs;
	}
}

public class DataDictionaryLoaderMySQL extends AbstractDataDictionaryLoader {

	public DataDictionaryLoaderMySQL(Connection conn) {
		super(conn);
	}

	ResultSet rs = null;
	
	@Override
	public Iterable<DatabaseTable> loadTables() {
		 try {
			rs = executeStatement("select table_schema, table_name from INFORMATION_SCHEMA.tables");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new TableIterable();
	}

	@Override
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table) {
		// TODO Auto-generated method stub
		return null;
	}

}
