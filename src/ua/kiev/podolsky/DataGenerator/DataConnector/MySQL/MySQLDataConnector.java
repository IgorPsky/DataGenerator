package ua.kiev.podolsky.DataGenerator.DataConnector.MySQL;

import ua.kiev.podolsky.DataGenerator.DataConnector.*;

public class MySQLDataConnector extends DataConnector {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String CONNECTOR_NAME = "MySQL";
	
	static {
		DataConnectorList.list().add(CONNECTOR_NAME, new MySQLDataConnector());
	}
	
	@Override
	public String getJdbcDriverName( ) {
		return JDBC_DRIVER;
	};
}
