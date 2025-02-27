package oops.bankapp1;

public class SavingAccount extends Account
{

	double intrestrate;

	public SavingAccount(String accountholder, double balance, double intrestrate)
	{
		super(accountholder, balance);
		this.intrestrate = intrestrate;
	} 
	
	public void calculateinterest()
	{
		double intrest = getBalance() * intrestrate / 100;
		
		System.out.println("intrest for the month" + intrest);

	}
	
	public void displayinfo()
	{
		super.displayinfo();
		System.out.println("intrest rate "+intrestrate + "%");
	}
}
