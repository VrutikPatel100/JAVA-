package Exceeption;
import java.util.Scanner;
public class Testapp2 {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no1:-");
		int no1 = sc.nextInt();
		
		System.out.println("enter no 2:-");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		try 
		{
			ans = no1 / no2;
		}catch(ArithmeticException e)
		{
			System.out.println("Exception Handled by Catch Block");
		}
		System.out.println("Addition:-" + ans);
;	}

}
