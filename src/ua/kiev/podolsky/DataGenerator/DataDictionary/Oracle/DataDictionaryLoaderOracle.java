package ua.kiev.podolsky.DataGenerator.DataDictionary.Oracle;

import static ua.kiev.podolsky.DataGenerator.Utils.StrQuote;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.function.Predicate;

import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableKey;

public class DataDictionaryLoaderOracle extends AbstractDataDictionaryLoader {

	public DataDictionaryLoaderOracle(Connection conn) {
		super(conn);
	}

	@Override
	public String getSelectStatement(Collection<String> schemas) {
		StringBuilder inList = new StringBuilder();
		for(String schema: schemas) {
			if (inList.length() != 0) inList.append(", ");
			inList.append(StrQuote(schema)); 
			}
		return "select owner, table_name from all_tables where owner in (" + inList + ")";
	}

	@Override
	public DatabaseTable createTable(ResultSet rs) throws SQLException {
			return DatabaseTable.create(rs.getString("OWNER"), rs.getString("TABLE_NAME"), this);
	}

	@Override
	public String getColumnsSelectStatement(DatabaseTable t) {
		return "select column_name from all_tab_columns where table_name = '" + t.name() + "' and owner = '" + t.owner() + "'";
	}

	@Override
	public DatabaseTableColumn createColumn(DatabaseTable t, ResultSet rs) throws SQLException {
		try {
			return new DatabaseTableColumn.Builder(t, rs.getString("COLUMN_NAME")).build();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getKeySelectStatement(DatabaseTable t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseTableKey createKey(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
}
