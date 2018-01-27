/**
 * 
 */
package ua.kiev.podolsky.DataGenerator;

import java.sql.SQLException;
import java.util.logging.Level;

import ua.kiev.podolsky.DataGenerator.DataConnector.MySQL.MySQLDataConnector;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryConnector;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.MySQL.MySQLDictionaryConnector;

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
			// DataDictionaryConnector ddc = new MySQLDictionaryConnector(dc);
			// DatabaseTableList list = ddc.listTables("0=0");
		} finally
		{
		dc.disconnect();
		}
	}

}
