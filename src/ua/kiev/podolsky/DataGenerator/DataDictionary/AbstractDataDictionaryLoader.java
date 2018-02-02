package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ua.kiev.podolsky.DataGenerator.RsToIter;

public abstract class AbstractDataDictionaryLoader implements DataDictionaryLoader, AutoCloseable {
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
		Iterable<DatabaseTable> result = null;
		try  {
			ResultSet rs = executeStatement(getSelectStatement());			
			result = RsToIter.<DatabaseTable>ResultSet2Iterable(rs, (ds) -> createTable(ds));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public abstract String getSelectStatement();

	public abstract DatabaseTable createTable(ResultSet rs);

	ResultSet columnsRs;
	
	public abstract String getColumnsSelectStatement(DatabaseTable t);
	
	public abstract DatabaseTableColumn createColumn(DatabaseTable t, ResultSet rs);
	
	@Override
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table) {
		Iterable<DatabaseTableColumn> result = null;
		try  {
			ResultSet rs = executeStatement(getColumnsSelectStatement(table));			
			result = RsToIter.<DatabaseTableColumn>ResultSet2Iterable(rs, (ds) -> createColumn(table, ds));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void close() {
		connection = null;
	}

}
