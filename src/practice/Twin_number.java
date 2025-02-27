package practice;
import java.util.Scanner;
public class Twin_number {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a[] =new int [5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int no = a[i];
			
			int sum =0 ; 
			int  mul =1 ; 
			
			while(no > 0)
			{
				int temp = no % 10 ;
				sum = sum + temp;
				mul = mul * temp;
				
				no = no / 10;
			}
			if(sum==mul)
			{
				System.out.println("A["+i+"] : "+ a[i]);
			}
		}
	}
}