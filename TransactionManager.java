
import java.util.Scanner;

public class TransactionManager 
{
	String first;
	String last;
	Float amount;
	boolean loyal;
	String date;
	private TransactionManager manager;
	
	
	public TransactionManager()
	{
		//manager = new TransactionManager();
	}
	
	/*private Account parseCommand(String[] cmdArray)
	{
		String first = cmdArray[1];
		String last = cmdArray[2];
		Float amount = Float.parseFloat(cmdArray[3]);
		boolean loyal = Boolean.parseBoolean(cmdArray[4]);
		return new Account(first, last, amount, loyal);
	}*/
	
	public void run()
	{
		System.out.println("Running manager");
		boolean transacting = true;
		while(transacting)
		{
			Scanner input = new Scanner(System.in);
			String cmd = input.nextLine();
			String[] cmdArray = cmd.split(" ");
			
			switch(cmdArray[0])
			{
				case "OC":
					if(cmdArray.length == 6)
					{
						//Opens checking account with first last amount loyal
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						date = cmdArray[4];
						loyal = Boolean.parseBoolean(cmdArray[5]);
						System.out.println("Account opened and added to the database.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "OS":
					if(cmdArray.length == 6)
					{
						//Opens savings account with first last amount loyal
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						date = cmdArray[4];
						loyal = Boolean.parseBoolean(cmdArray[5]);
						System.out.println("Account opened and added to the database.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "OM":
					if(cmdArray.length == 5)
					{
						//Opens money market account with first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						date = cmdArray[4];
						loyal = Boolean.parseBoolean(cmdArray[5]);
						System.out.println("Account opened and added to the database.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "CC":
					if(cmdArray.length == 3)
					{
						//Close checking account with first last
						first = cmdArray[1];
						last = cmdArray[2];
						
						System.out.println("Account closed and removed from the database.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "CS":
					if(cmdArray.length == 3)
					{
						//close savings account with first last
						first = cmdArray[1];
						last = cmdArray[2];
						
						System.out.println("Account closed and removed from the database.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "CM":
					if(cmdArray.length == 3)
					{
						//close money market amount with first last
						first = cmdArray[1];
						last = cmdArray[2];
						
						System.out.println("Account closed and removed from the database.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "DC":
					if(cmdArray.length == 4)
					{
						//depoist to checking first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"Deposited into the account.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "DS":
					if(cmdArray.length == 4)
					{
						//deposit to savings first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"Deposited into the account.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "DM":
					if(cmdArray.length == 4)
					{
						//deposit to money market first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"Deposited into the account.");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WC":
					if(cmdArray.length == 3)
					{
						//withdraw checing first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"withdrawn from the account.");
						//if withdraw is over total account amount
						System.out.println("Insufficient funds");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WS":
					if(cmdArray.length == 3)
					{
						//withdraw savings first last amount
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"withdrawn from the account.");
						//if withdraw is over total account amount
						System.out.println("Insufficient funds");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "WM":
					if(cmdArray.length == 3)
					{
						//withdraw money market first last amount'
						first = cmdArray[1];
						last = cmdArray[2];
						amount = Float.parseFloat(cmdArray[3]);
						System.out.println(/*amount + */"withdrawn from the account.");
						//if withdraw is over total account amount
						System.out.println("Insufficient funds");
					}
					else
					{
						System.out.println("Invalid Command");
					}
					break;
				case "PA":
					//print list of all acounts
					System.out.println("--Listing accounts in the database--");
					
					System.out.println("--end of listing--");
					break;
				case "PD":
					System.out.println("--Printing statements by data opened--");
					//calculate list of monthly intrests + fees
					//print account statements in sorted by opening dates
					break;
				case "PN":
					System.out.println("--Printing statements by last name--");
					//Same as PD, but sorted bt last names in acending order
					break;
				case "Q":
					System.out.println("Transaction processing completed.");
					transacting = false;
					break;
				default:
					System.out.println("Invalid Command");
			}
		}
	}
	
}