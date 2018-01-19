package ua.kiev.podolsky.DataGenerator.DataDictionary;

public class DatabaseTableColumnVarchar extends DatabaseTableColumn{
	
	  DatabaseTableColumnVarchar(String name, int length, boolean isNullable) {
		super(name, new DatabaseType(), length, isNullable);
	}

	@Override 
	  public String getRandomValue() {
		  StringBuilder s = new StringBuilder();
		  return s.toString();
	  }
}
