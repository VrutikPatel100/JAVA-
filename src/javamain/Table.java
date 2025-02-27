package javamain;
import java.util.Scanner;
public class Table 
{
	public static void main(String args[])
	{
		int n,i,a;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number for you want to a table:-");
		n=sc.nextInt();
		for(i=0;i<=10;i++)
		{
			a=n*i;
			System.out.println(n+"*" + i + "=" + a);
			sc.close();
		}
	}
	
}
