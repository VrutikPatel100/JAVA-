package array;
import java.util.Scanner;
public class Array_not_palindrom {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter A["+i+"] :");
			a[i]= sc.nextInt();
			
		}
		
		
		for (int i=0;i<a.length;i++)
		{
			int rev=0;
			int no=a[i];
			while(no>0)
			{
				int tmp= no % 10;
				rev = (rev*10) + tmp;
				no =no/10;
				
			}
			if (!(rev==a[i]))
			{
				System.out.println("A["+i+"] :" + a[i]);
			}
		}
		sc.close();
	}
}
