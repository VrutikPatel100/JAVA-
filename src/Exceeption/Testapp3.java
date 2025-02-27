package Exceeption;
import java.util.Scanner;
public class Testapp3 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no1:-");
		int no1 = sc.nextInt();
		
		System.out.println("enter no 2:-");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		try {
			
			ans = no1 / no2;
			
			String name = null;
			System.out.println("name.length() :- " + name.length());
			int a[] =new int[5];
			a[5] = 100;
		
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Handled By Catch Block ");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException Handled By Catch Block");
		}catch(Exception e)
		{
			System.out.println("Exception Handled By Catch Block");
		}
		System.out.println("Addition:-" + ans);
				
	}
}