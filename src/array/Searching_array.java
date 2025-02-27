package array;
import java.util.Scanner;
public class Searching_array 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int[5];
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter A["+i+"] :- ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the key you want to find :-");
		int key = sc.nextInt();
		for (int i=0;i<a.length;i++)
		{
			if (a[i] == key)
			{
				System.out.print("A["+i+"] :- " + a[i]);
			}
		}
		sc.close();
	}
}
