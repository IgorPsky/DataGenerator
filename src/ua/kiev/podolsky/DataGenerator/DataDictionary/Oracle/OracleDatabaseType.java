package ua.kiev.podolsky.DataGenerator.DataDictionary.Oracle;

import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataTypes.DatabaseTypeNumber;
import ua.kiev.podolsky.DataGenerator.DataDictionary.AbstractDataTypes.DatabaseTypeString;

public class OracleDatabaseType {
	public static class OracleTypeNumber extends DatabaseTypeNumber {
	}
	public static class OracleTypeVarchar extends DatabaseTypeString {
	}
	public static OracleDatabaseType of(String oracleTypeName) {
		OracleDatabaseType result = null;
		switch (oracleTypeName) {
		    case "VARCHAR2":
		    	result = null; // new OracleTypeVarchar();
		}
		return result;
	}

}
