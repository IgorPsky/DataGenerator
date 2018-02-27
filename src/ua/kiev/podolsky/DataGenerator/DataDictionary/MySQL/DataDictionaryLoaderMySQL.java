package ua.kiev.podolsky.DataGenerator.DataDictionary.MySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.function.Predicate;

import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableKey;

import static ua.kiev.podolsky.DataGenerator.Utils.*;

public class DataDictionaryLoaderMySQL extends AbstractDataDictionaryLoader {

	public DataDictionaryLoaderMySQL(Connection conn) {
		super(conn);
	}

	ResultSet rs = null;
	
	@Override
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table, Predicate<DatabaseTableColumn> filter) {
		return super.loadColumns(table);
	}

	@Override
	public String getSelectStatement(Collection<String> schemas) {
		StringBuilder inList = new StringBuilder();
		for(String schema: schemas) {
			if (inList.length() != 0) inList.append(", ");
			inList.append(StrDoublequote(schema));
		}
		return "select table_schema, table_name from INFORMATION_SCHEMA.tables where "
				+ "table_schema in (" + inList + ")";
	}

	@Override
	public DatabaseTable createTable(ResultSet rs) throws SQLException {
		return DatabaseTable.create(rs.getString("TABLE_SCHEMA"), rs.getString("TABLE_NAME"), this);
	}

	@Override
	public String getColumnsSelectStatement(DatabaseTable t) {
		return "select column_name, data_type, character_maximum_length, numeric_precision, numeric_scale from INFORMATION_SCHEMA.columns "
				+ " where table_schema = " + StrDoublequote(t.owner()) + " and table_name = " +
				StrDoublequote(t.name());
	}

	@Override
	public DatabaseTableColumn createColumn(DatabaseTable t, ResultSet rs) throws SQLException {
		return new DatabaseTableColumn.Builder(t, rs.getString("column_name")).build();
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
