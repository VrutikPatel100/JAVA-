package javamain;
import java.util.Scanner;
public class Positivenegative {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter no 1 :-" );
		int no1 = sc.nextInt();
		
		if(no1 > 0)
		{
			System.out.println("No is Positive");

		}else if(no1 < 0)
		{
			System.out.println("No is Negative");
		}else
		{
			System.out.println("No is Zero");
		}
		sc.close();
	}

}
