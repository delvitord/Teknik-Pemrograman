package task3;

public class Commission extends Hourly
{
	double totalSales2, commissionRate, payment;
	
	public Commission (String eName, String eAddress, String ePhone, 
					   String socSecNumber, double rate, double commissionRate2)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);	
		commissionRate = commissionRate2;
	}
	
	public double addSales (double totalSales)
	{
		totalSales2 = totalSales;
		return totalSales2;
	}
	
	public double pay()
	{
	  payment = super.pay();  
	  payment += (totalSales2*commissionRate);
      return payment;    
	 }
	
	public String toString()
	{ 
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales2;
		result += "\nCommision: " + commissionRate;  
		result += "\nTest: " + payment ; 
	    return result;
	}
}