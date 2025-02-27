package Exceeption;
import java.util.Scanner;
public class Nested_Try_Catch
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
				try
				{
					ans = no1 / no2;
				}catch(ArithmeticException e)
				{
					e.printStackTrace();
				}
				
				try
				{
					String name = null;
					System.out.println("name.length() :- " + name.length());		
				}catch(NullPointerException e)
				{
					e.printStackTrace();
				}
				try
				{
					int a[] =new int[5];
					a[5] = 100;
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			System.out.println("Addition:-" + ans);
	}
}
			
			
		
			
		
	