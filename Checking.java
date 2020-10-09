
public class Checking extends Account {
	private boolean directDeposit;
	
	public Checking(Profile holder, double balance, Date dateOpen, boolean directDeposit)
	{
		super(holder, balance, dateOpen);
		this.directDeposit = directDeposit;
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
