package pattern.creational.abs.factory;

import java.util.Map;

import pattern.Operation;

public abstract class OperationAbsFactory {
	
	public abstract Operation createOperation(Map<String, Object> operation);

}
