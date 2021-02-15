package pattern.creational.abs.factory;

import java.util.Map;

import pattern.Bonifico;
import pattern.Onboarding;
import pattern.Operation;

public class OperationFactory extends OperationAbsFactory {

	@Override
	public Operation createOperation(Map<String, Object> operation) {
		
		Operation ret = null;
		String op = String.valueOf(operation.get("operation"));
		
		if("bonifico".equalsIgnoreCase(op)) {
			ret = new Bonifico("bonifico", (int)operation.get("amount"));
		}else if("onboarding".equalsIgnoreCase(op)) {
			ret = new Onboarding("onboarding", (String)operation.get("service"));
		}
		
		return ret;
	}

}
