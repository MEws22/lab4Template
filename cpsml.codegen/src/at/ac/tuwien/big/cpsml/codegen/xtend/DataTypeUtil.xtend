package at.ac.tuwien.big.cpsml.codegen.xtend

import cpsml.DataType
import cpsml.Parameter
import at.ac.tuwien.big.cpsml.codegen.lib.Util

class DataTypeUtil {
	
	/**
	 * Creates the appropriate type syntax for each DataType.
	 */
	static def dataType(DataType type) {
		return type === DataType.BOOLEAN ? "Boolean" :
			   type === DataType.INT ? "int" :
			   type === DataType.STRING ? "String" :
			   "void" ;
	}
		
	/**
	 * Creates the appropriate return content syntax for each DataType.
	 */
	static def returnDataGenerator(DataType type) {
		return type === DataType.BOOLEAN ? Util.randomBool() :
			   type === DataType.INT ? Util.randomInt() :
			   type === DataType.STRING ? '"_DummyString_"' :
			   "" ;
	}
	
	/**
	 * Creates the appropriate String parsing syntax for each DataType.
	 */
	static def paramTypeConverter(Parameter param) {
		return param.dataType === DataType.BOOLEAN ? "inputIter.next()" + '.equals("true")' :
			   param.dataType === DataType.INT ?  'Integer.parseInt(' + "inputIter.next()" +')' :
			   param.dataType === DataType.STRING ? "inputIter.next()" :
			   "" ;
	}
	
}