public class Date implements Comparable<Date>
{
	private int year;
	private int month;
	private int day;
	
	public Date(int day, int month, int year)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int compareTo(Date date)
	{ 
		
		if(this.year == date.year)
		{
			if(this.month == date.month)
				return this.day > date.day ? 1 : this.day < date.day ? -1 : 0;
			else
				return this.month > date.month ? 1 : this.month < date.month ? -1 : 0;
		}
		else
		{
			return this.year > date.year ? 1 : this.year < date.year ? -1 : 0;
		}		
	} //return 0, 1, or -1
	
	public String toString() 
	{ 
		return day + "/" + month + "/" + year;
	} //in the format mm/dd/yyyy
	
	public boolean isValid() 
	{
		return year >= 0 && year <= 2020 && month >= 1 && month <= 12 && day >= 1 && day <= 31;
	}
}