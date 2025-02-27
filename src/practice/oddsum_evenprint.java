package practice;

import java.util.Scanner;

public class oddsum_evenprint {

	public static void main(String args[])
	{
		int sum=0;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i=0;i<5;i++)
		{
			System.out.print("enter A["+i+"]:-");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(" A["+i+"]:-"+a[i]);
		}
		
		for(int i=0;i<5;i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println("even no is :- "+a[i]);
			
			}
		
			else
			{	
			 sum=sum +a[i];
			}
			sc.close();
		}
		System.out.println("odd sum  is := "+sum);
	}
}