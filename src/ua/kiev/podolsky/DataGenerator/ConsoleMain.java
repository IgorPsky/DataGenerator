/**
 * 
 */
package ua.kiev.podolsky.DataGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;

import ua.kiev.podolsky.DataGenerator.DataDictionary.DataDictionaryLoader;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTable;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableColumn;
import ua.kiev.podolsky.DataGenerator.DataDictionary.DatabaseTableList;
import ua.kiev.podolsky.DataGenerator.DataDictionary.MySQL.DataDictionaryLoaderMySQL;
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
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		// doOracle();
		doMySQL();
	}
	
	public static void doOracle() {
		DatabaseTableList l;
		try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//vhgtestdb:1521/vhgtest", "igorp", "SkodaKodiaq#1");
				DataDictionaryLoader loader = new DataDictionaryLoaderOracle(conn)) {
			l = new DatabaseTableList(loader);
			Collection<String> c = new ArrayList<>();
			c.add("IGORP");
			l.load(c);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
		for (DatabaseTable t: l) {
			System.out.println(t.owner()+"."+t.name());
		}
	}
	
	public static void doMySQL() {
		DatabaseTableList l;
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DataGeneratorTest",
				"DataGenerator", "DataGenerator"); DataDictionaryLoader loader = new DataDictionaryLoaderMySQL(conn)) {
			l = new DatabaseTableList(loader);
			Collection<String> c = new ArrayList<>();
			c.add("DataGeneratorTest".toLowerCase());
			l.load(c);
			for (DatabaseTable t : l) {
				System.out.println(t.owner() + "." + t.name());
				for (DatabaseTableColumn tc : t.columns()) {
					System.out.println(tc.name());
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
