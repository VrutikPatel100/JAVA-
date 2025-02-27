package array;
import java.util.Scanner;
public class SUM2D
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][6];
		
		int sum=0;
		
		for (int i=0 ; i<a.length; i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.println("Enter A["+i+"]["+j+"] :");
				a[i][j] = sc.nextInt();
				 
				sum = sum + a[i][j];
						
			}
			
			a[i][5] = sum;
			sum=0;
			
		}
		
		for (int i=0 ;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.println("A["+i+"]["+j+"] :" + a[i][j]);
			}
		}
		
	}
}