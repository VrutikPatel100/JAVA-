package oops.bankapp1;

public class BankApplication
{
	public static void main(String[] args)
	{
		SavingAccount SavingAccount = new SavingAccount("vrutik",10000,1.5);
		
		CurrentAccount CurrentAccount = new CurrentAccount("om",20000,10000);
		
		SavingAccount.displayinfo();
		CurrentAccount.displayinfo();
		
		System.out.println("performing operation on saving account : ");
		SavingAccount.deposit(50000);
		SavingAccount.withdrow(55000);
		SavingAccount.calculateinterest();
		
		System.out.println("performing operation on current Account : ");
		CurrentAccount.deposit(10000);
		System.out.println("Current Account Balance : " + CurrentAccount.getBalance());
		
		
		CurrentAccount.withdrow(30000);
		CurrentAccount.displayinfo();
		
		//currentAccount.withdrow(35000);
		
		
	}
}
