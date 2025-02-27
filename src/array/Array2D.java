package array;
import java.util.Scanner;
public class Array2D 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][5];
		
///		System.out.println("a[0].length :" + a[0].length);
		
		for(int i = 0; i< a.length; i++)
		{
			for(int j = 0; j < a[i].length;j++)
			{
				System.out.println("Enter A["+i+"]["+j+"] :- ");
				a[i][j] = sc.nextInt();
			}
		}
		for( int i = 0; i < a.length; i++)
		{
			for (int j = 0;j < a[i].length;j++)
			{
				System.out.println("A["+i+"]["+j+"] :-" + a[i][j]);
			}
		}
		sc.close();
//		int [][]a = new int [3][5];
//		int [][] a = new int [3][5];
//		int []a[] = new int [3][5];
//		
//		int a[][] = null;
//		a=new int[3][5];
	}
}

























