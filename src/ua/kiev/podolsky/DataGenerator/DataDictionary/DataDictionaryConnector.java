package ua.kiev.podolsky.DataGenerator.DataDictionary;

public interface DataDictionaryConnector {
   DatabaseTableList listTables(String whereCondition);
   DatabaseTableColumnList listColumns(DatabaseTable table, String whereCondition);
   
}
