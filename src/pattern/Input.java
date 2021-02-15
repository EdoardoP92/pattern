package pattern;

import java.util.HashMap;
import java.util.Map;

public class Input {

	protected static Map<String, Object>createBonifico(){

		Map<String, Object> ret = new HashMap<>();
		ret.put("operation", "bonifico");
		ret.put("amount", 100);
		return ret;
	}

	protected static Map<String, Object>createOnboarding(){

		Map<String, Object> ret = new HashMap<>();
		ret.put("operation", "onboarding");
		ret.put("service", "new_service");
		return ret;
	}
}
