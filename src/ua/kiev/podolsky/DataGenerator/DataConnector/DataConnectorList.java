package ua.kiev.podolsky.DataGenerator.DataConnector;

import java.util.HashMap;
import java.util.Map;

public class DataConnectorList {
   private static DataConnectorList list = new DataConnectorList();
   
   private Map<String, DataConnector> connectorList = new HashMap<>();
   public void add(String name, DataConnector connector) {
	   connectorList.put(name, connector);
   };
   public DataConnector getConnector(String name) {
	   return connectorList.get(name);
   }
   public static DataConnectorList list() {return list;}
}
