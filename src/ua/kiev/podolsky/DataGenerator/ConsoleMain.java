/**
 * 
 */
package ua.kiev.podolsky.DataGenerator;

import java.sql.SQLException;
import java.util.logging.Level;

import ua.kiev.podolsky.DataGenerator.DataConnector.MySQL.MySQLDataConnector;

/**
 * @author igorp
 *
 */
public class ConsoleMain {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		Utils.LOGGER.log(Level.FINE, "Hello, world!");
		MySQLDataConnector dc = new MySQLDataConnector();
		dc.connectString = "jdbc:mysql://localhost/";
		dc.connect("DataGenerator", "DataGenerator");
		try {
			
		} finally
		dc.
	}

}
