public abstract class Account 
{
	private Profile holder;
	private double balance;
	private Date dateOpen;
	
	public Account(Profile holder, double balance, Date dateOpen)
	{
		this.holder = holder;
		this.balance = balance;
		this.dateOpen = dateOpen;
	}
	
	public void debit(double amount) 
	{
		balance -= amount;
	} //decrease the balance by amount
	
	public void credit(double amount)
	{
		balance += amount;
	} //increase the balance by amount
	
	public String toString() 
	{
		
	}
	
	public abstract double monthlyInterest()
	{
		
	}
	
	public abstract double monthlyFee() 
	{
		
	}
	
	public Profile getProfile()
	{
		return holder;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public Date getDateOpen()
	{
		return dateOpen;
	}
	
	
	public boolean equals(Account account) 
	{
		boolean sameType = getClass().getName().equals(account.getClass().getName());
		boolean sameFname = getProfile().getFname().equals(account.getProfile().getFname());
		boolean sameLname = getProfile().getLname().equals(account.getProfile().getLname());
		
		return (sameType && sameFname && sameLname);
	}
}