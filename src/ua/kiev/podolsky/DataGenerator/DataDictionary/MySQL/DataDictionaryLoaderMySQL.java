package ua.kiev.podolsky.DataGenerator.DataDictionary.MySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;
import static ua.kiev.podolsky.DataGenerator.Utils.*;

public class DataDictionaryLoaderMySQL extends AbstractDataDictionaryLoader {

	public DataDictionaryLoaderMySQL(Connection conn) {
		super(conn);
	}

	ResultSet rs = null;
	
	@Override
	public Iterable<DatabaseTableColumn> loadColumns(DatabaseTable table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSelectStatement() {
		return "select table_schema, table_name from INFROMATION_SCHEMA.tables";
	}

	@Override
	public DatabaseTable createTable(ResultSet rs) throws SQLException {
		return new DatabaseTable(rs.getString("TABLE_SCHEMA"), rs.getString("TABLE_NAME"));
	}

	@Override
	public String getColumnsSelectStatement(DatabaseTable t) {
		return "select column_name, data_type, character_maximum_length, numeric_precision, numeric_scale from INFORMATION_SCHEMA.columns "
				+ " where table_schema = " + StrDoublequote(t.owner()) ;
	}

	@Override
	public DatabaseTableColumn createColumn(DatabaseTable t, ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
