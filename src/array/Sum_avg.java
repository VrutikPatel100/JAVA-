package array;
import java.util.Scanner;
public class Sum_avg {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a1[] = new int[10];
		int sum=0,avg=0;
		
		for (int i=0 ; i<a1.length ; i++)
		{
			System.out.println("Enter A["+ i +"] :");
			a1[i] = sc.nextInt();
		}
		
		for (int i=0;i<a1.length;i++)
		{
			sum=sum+a1[i];
		}
		avg=sum/a1.length;
		System.out.println("the sum is :" + sum);
		System.out.println("the avg is :" + avg);
	}
}