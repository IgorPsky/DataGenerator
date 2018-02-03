package ua.kiev.podolsky.DataGenerator.DataDictionary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

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
	public Iterable<DatabaseTable> loadTables(Collection<String> schemas) {
		Iterable<DatabaseTable> result = null;
		try  {
			ResultSet rs = executeStatement(getSelectStatement(schemas));			
			result = RsToIter.<DatabaseTable>ResultSet2Iterable(rs, (ds) -> createTable(ds));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public abstract String getSelectStatement(Collection<String> schemas);

	public abstract DatabaseTable createTable(ResultSet rs) throws SQLException;

	ResultSet columnsRs;
	
	public abstract String getColumnsSelectStatement(DatabaseTable t);
	
	public abstract DatabaseTableColumn createColumn(DatabaseTable t, ResultSet rs) throws SQLException;
	
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
