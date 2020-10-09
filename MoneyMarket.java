
public class MoneyMarket extends Account 
{
	private int withdrawals;
	
	public MoneyMarket(Profile holder, double balance, Date dateOpen)
	{
		super(holder, balance, dateOpen);
		withdrawals = 0;
	}

	public int getWithdrawals()
	{
		return withdrawals;
	}
	
	public void incrementWithdrawals()
	{
		withdrawals++;
	}
	
	@Override
	public double monthlyInterest() {
		return 0;
	}

	@Override
	public double monthlyFee() {
		return 0;
	}
}
