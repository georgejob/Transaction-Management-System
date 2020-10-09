
public class Savings extends Account 
{
	private boolean isLoyal;
	
	public Savings(Profile holder, double balance, Date dateOpen, boolean isLoyal) {
		super(holder, balance, dateOpen);
		this.isLoyal = isLoyal;
	}
	
	

	@Override
	public double monthlyFee() {
		return 0;
	}

	@Override
	public double monthlyInterest() {
		return 0;
	}

	
}
