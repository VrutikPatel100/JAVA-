package oops.bankapp1;

public class Account 
{
	
	String accountholder;
	double balance;
	
	public Account(String accountholder, double balance)
	{
		super();
		this.accountholder = accountholder;
		this.balance = balance;
	}
	
	//deposit money
	
	public void deposit(double amount)
	{
		if (amount > 0)
		{
			balance = balance + amount;
			System.out.println(amount + "deposit successfully");
		}else
		{
			System.out.println("invalid amount");
		}
	}
	public void withdrow(double amount)
	{
		if((amount > 0 ) && (amount <= balance))
		{
			balance = balance - amount;
			System.out.println(amount+ "withdrawn successfully");
		}else
		{
			System.out.println("invalid or insufficient balance");

		}
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void displayinfo()	
	{
		System.out.println(accountholder + " " + balance); 

	}
}
