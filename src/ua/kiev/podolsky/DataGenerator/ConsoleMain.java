/**
 * 
 */
package ua.kiev.podolsky.DataGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

import ua.kiev.podolsky.DataGenerator.DataConnector.MySQL.MySQLDataConnector;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.Oracle.DataDictionaryLoaderOracle;

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
		Utils.LOGGER.log(Level.FINE, "ParamsCount:"+args.length);
		doOracle();
	}
	
	public static void doOracle() {
		try {
			Connection conn = DriverManager.getConnection("jdbc.oracle.thin:@//vhgtestdb:1521/vhgtest", "igorp", "SkodaKodiaq#1");
			DatabaseTableList l = new DatabaseTableList(new DataDictionaryLoaderOracle(conn));
			l.load();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}

}
