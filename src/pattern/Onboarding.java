package pattern;

public class Onboarding extends Operation {
	
	private String service;

	public Onboarding(String operation, String service) {
		super(operation);
		this.service = service;
		System.out.println(this);
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "Onboarding [service=" + service + ", operation=" + getOperation() + "]";
	}
}
