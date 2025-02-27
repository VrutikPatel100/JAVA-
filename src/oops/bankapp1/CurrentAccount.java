package oops.bankapp1;

public class CurrentAccount extends Account
{
	double overdraftlimit;

	public CurrentAccount(String accountholder, double balance, double overdraftlimit) {
		super(accountholder, balance);
		this.overdraftlimit = overdraftlimit;
	}
	public void withdrow(double amount)
	{
		if((amount > 0) && (amount <= (balance+overdraftlimit)))
		{
			super.withdrow(amount);
		}else
		{
			System.out.println("invalid amount or  insufficient balance or overdraft limit exceedeed.");

		}
	}
	public void displayinfo()
	{
		super.displayinfo();
		System.out.println("overdraft limit : " + overdraftlimit);

	}
}
