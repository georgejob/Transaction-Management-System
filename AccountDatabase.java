import java.text.DecimalFormat;

public class AccountDatabase 
{
	private Account[] accounts;
	private int size;
	
	public AccountDatabase()
	{
		accounts = new Account[5];
		size = 0;
	}
	
	private int find(Account account) 
	{
		for(int i = 0; i < size; i++)
		{
			//System.out.println("find, i: " + i + ", size: " + size);
			if(accounts[i].equals(account))
				return i;
		}
		return -1;
	}
	
	private void grow() 
	{ 
		//USE ARRAYCOPY(0,0, ARRAYLENGTH) TO MAKE A NEW ARRAY WITH 5 EXTRA SPOTS
		Account[] temp = new Account[accounts.length +5];
		System.arraycopy(accounts, 0, temp, 0, accounts.length);
		accounts = temp;
	}
	
	public boolean add(Account account) 
	{
		if(find(account) < 0)
		{
			if(accounts.length == size)
			{
				grow();
				accounts[size] = account;
				size++;
				return true;
			}
			else
			{
				accounts[size] = account;
				size++;
				return true;
			}
		}
		else
		{
			return false;
		}
	} //return false if account exists
	
	public boolean remove(Account account)
	{ 
		int accountIndex = find(account);
		if(accountIndex >= 0)
		{
			accounts[accountIndex] = accounts[size-1];
			accounts[size-1] = null;
			size--;
			return true;
		}
		
		return false;
	} //return false if account doesn’t exist
	
	public boolean deposit(Account account, double amount)
	{ 
		int accountIndex = find(account);
		if(accountIndex >= 0)
		{
			accounts[accountIndex].credit(amount);
			return true;
		}
		
		return false;
	}
	//return 0: withdrawal successful, 1: insufficient funds, -1 account doesn’t exist
	
	public int withdrawal(Account account, double amount)
	{ 
		int accountIndex = find(account);
		if(accountIndex >= 0)
		{
			if((accounts[accountIndex].getBalance() - amount) >= 0)
			{
				accounts[accountIndex].debit(amount);
				
				/*if(accounts[accountIndex].getClass().getName().equals("MoneyMarket"))
				{
					accounts[accountIndex].incrementWithdrawals();
				}*/
				
				return 0;
			}
			else
			{
				return 1;
			}
		}
		
		return -1;
	}
	
	private void sortByDateOpen()
	{ 
		
	} //sort in ascending order
	
	private void sortByLastName()
	{ 
		
	} //sort in ascending order
	
	public void printByDateOpen()
	{ 
		sortByDateOpen();
		//use compareto to find dates
		//Slection sort will work or quick sort
	}
	
	public void printByLastName()
	{ 
		sortByLastName();
	}
	
	public void printAccounts()
	{
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		for(Account acc : accounts)
		{
			System.out.println("*" + acc.getClass().getName() + "*" + acc.getProfile().getFname() + " " + acc.getProfile().getLname() + "* $" + df.format(acc.getBalance()) + "*" + acc.getDateOpen().toString() + last);
		}
	}

	public int getSize()
	{
		return size;
	}
}