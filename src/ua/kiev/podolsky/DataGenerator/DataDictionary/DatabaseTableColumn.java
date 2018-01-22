package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseTableColumn {
  public final DatabaseTable table;
  public final String columnName;
  public final boolean isNullable;
  public final int length;
  public final DatabaseType type;
  public DatabaseTableColumn(DatabaseTable table, String name, DatabaseType type, int length, boolean isNullable){
	  columnName = name;
	  this.isNullable = isNullable;
	  this.length = length;
	  this.type = type;
	  this.table = table;
  }
  public String Name() {return columnName;}
  public int length() {return length;}
  public boolean isNullable() {return isNullable;}
  public DatabaseType type() {return type;}
  public String getRandomValue() {return "";}
}
