package javamain;
import java.util.Scanner;
public class Swaping 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no1,no2,temp;
		
		
		System.out.println("before swapping");
		System.out.print("enter no 1 :-" );
		no1 = sc.nextInt();
		System.out.print("enter no 2 :-");
		no2=sc.nextInt();
		
		temp = no1;
		no1 = no2;
		no2 = temp;
		
		System.out.println("after swapping");
		System.out.println("no 1 :-" + no1);
		System.out.println("no 2 :-" + no2);
		
		sc.close();
	}
}
