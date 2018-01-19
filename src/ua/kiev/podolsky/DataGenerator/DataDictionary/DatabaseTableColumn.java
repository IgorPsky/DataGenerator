package ua.kiev.podolsky.DataGenerator.DataDictionary;

public abstract class DatabaseTableColumn {
  private String columnName;
  private boolean isNullable;
  private int length;
  private DatabaseType type;
  public DatabaseTableColumn(String name, DatabaseType type, int length, boolean isNullable){
	  columnName = name;
	  this.isNullable = isNullable;
	  this.length = length;
	  this.type = type;
  }
  public String Name() {return columnName;}
  public void setName(String n) {columnName = n;}
  public int length() {return length;}
  public boolean isNullable() {return isNullable;}
  public DatabaseType type() {return type;}
  public abstract String getRandomValue();
}
