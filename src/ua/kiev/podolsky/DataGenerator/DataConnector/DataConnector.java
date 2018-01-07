package ua.kiev.podolsky.DataGenerator.DataConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

import ua.kiev.podolsky.DataGenerator.Utils;

public abstract class DataConnector {
	private Connection conn;
	public String connectString;
	abstract public String getJdbcDriverName();
	private boolean isConnected = false;
	public void connect (String user, String password) throws SQLException {
		conn = DriverManager.getConnection(connectString, user, password);
		isConnected = true;
	}
	public Connection connection() {return conn;};
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			Utils.LOGGER.log(Level.SEVERE, e.getMessage(), e.toString());
		}
	}
}

