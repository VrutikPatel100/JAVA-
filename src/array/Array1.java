//package array;
//import java.util.Scanner;
//public class Array1 
//{
//	public static void main(String [] args)
//	{
//		int arr[] = new int[5];
//		Scanner sc=new Scanner (System.in);
//		for(int i=0;i<5;i++)
//		{
//			System.out.print("enter A["+i+"]");
//			arr[i]=sc.nextInt();		
//		}
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("A["+i+"] : "+arr[i]);
//		}
//		
//	}
//}



package array;
import java.util.Scanner;
public class Array1
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		Scanner sc = new Scanner (System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("enter A["+i+"]");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("A["+i+"] : "+arr[i]);
		}
	}
}


