package ua.kiev.podolsky.DataGenerator.DataDictionary.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ua.kiev.podolsky.DataGenerator.DataConnector.DataConnector;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryConnector;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumnList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableList;

public class MySQLDictionaryConnector implements DataDictionaryConnector {
	private DataConnector dc;
	public MySQLDictionaryConnector(DataConnector dc) {
		this.dc = dc;
	}
	@Override
	public DatabaseTableList listTables(String whereCondition) {
		DatabaseTableList result = new DatabaseTableList();
		try {
			Statement stmt = dc.connection().createStatement();
			ResultSet s = stmt.executeQuery("select table_schema, table_name from information_schema.TABLES where 0=0 and "+whereCondition);
			while(s.next()) {
				DatabaseTable t = new DatabaseTable(s.getString(1), s.getString(2), this);
				result.List().add(t);
			}
		}
	    catch(SQLException e) {
	    	throw new RuntimeException(e);
	    }
		return result;
	}
	@Override
	public DatabaseTableColumnList listColumns(DatabaseTable table, String whereCondition) {
		DatabaseTableColumnList result = new DatabaseTableColumnList();
		try {
			Statement stmt = dc.connection().createStatement();
			ResultSet s = stmt.executeQuery("select table_schema, table_name from information_schema.TABLES where 0=0 and "+whereCondition);
			while(s.next()) {
				DatabaseTable t = new DatabaseTable(s.getString(1), s.getString(2), this);
				result.list().add(null);
			}
		}
	    catch(SQLException e) {
	    	throw new RuntimeException(e);
	    }
		
		return null;
	}

}
