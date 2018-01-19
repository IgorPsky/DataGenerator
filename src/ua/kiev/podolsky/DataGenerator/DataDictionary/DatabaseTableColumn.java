package ua.kiev.podolsky.DataGenerator.DataDictionary;

public abstract class DatabaseTableColumn {
  private String columnName;
  private boolean isNullable;
  private int length;
  public DatabaseTableColumn(String name, int length, boolean isNullable){
	  columnName = name;
	  this.isNullable = isNullable;
	  this.length = length;
  }
  public String Name() {return columnName;};
  public void setName(String n) {columnName = n;};
  public int length() {return length;};
  public boolean isNullable() {return isNullable;};
  public abstract String getRandomValue(); 
}
