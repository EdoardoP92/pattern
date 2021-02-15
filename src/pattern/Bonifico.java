package pattern;

public class Bonifico extends Operation {
	
	private int amount;
	
	public Bonifico(String operation, int amount) {
		super(operation);
		this.amount = amount;
		System.out.println(this);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bonifico [amount=" + amount + ", operation=" + getOperation() + "]";
	}

}
