package ua.kiev.podolsky.DataGenerator.DataDictionary.Oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;

public class DataDictionaryLoaderOracle extends AbstractDataDictionaryLoader {

	public DataDictionaryLoaderOracle(Connection conn) {
		super(conn);
	}

	@Override
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSelectStatement(Collection<String> schemas) {
		return "select owner, table_name from all_tables";
	}

	@Override
	public DatabaseTable createTable(ResultSet rs) throws SQLException {
			return DatabaseTable.create(rs.getString("OWNER"), rs.getString("TABLE_NAME"), this);
	}

	@Override
	public String getColumnsSelectStatement(DatabaseTable t) {
		return "select column_name from all_tab_columns where table_name = \"" + t.name() + "\" and table_owner = \"" + t.owner() + "\"";
	}

	@Override
	public DatabaseTableColumn createColumn(DatabaseTable t, ResultSet rs) throws SQLException {
		// try {
			// return new DatabaseTableColumn.Builder(t, rs.getString("COLUMN_NAME")).build();
			return null;
		// } catch (SQLException e) {
		//	throw new RuntimeException(e);
		// }
	}
}
