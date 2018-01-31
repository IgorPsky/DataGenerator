/**
 * 
 */
package ua.kiev.podolsky.DataGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
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
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		doOracle();
	}
	
	public static void doOracle() {
		DatabaseTableList l;
		try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//vhgtestdb:1521/vhgtest", "igorp", "SkodaKodiaq#1");
				DataDictionaryLoaderOracle loader = new DataDictionaryLoaderOracle(conn)) {
			l = new DatabaseTableList(loader);
			l.load();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
		for (DatabaseTable t: l) {
			System.out.println(t.owner()+"."+t.name());
		}
	}

}
