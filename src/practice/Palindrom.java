package practice;
import java.util.Scanner;
public class Palindrom {
	public static void main(String argss[])
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]");
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int rev=0;
			int no=a[i];
			while(no>0)
			{
				int temp = no % 10;
				rev= (rev*10)+temp;
				no = no / 10;
			}
			if(rev==a[i])
			{
				System.out.println("A["+i+"] : "+a[i]);
			}
		}
	}
}