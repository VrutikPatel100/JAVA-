package array;
import java.util.Scanner;
public class Cross2D {
	
	    public static void main (String args[])
	    {
	    	Scanner sc = new Scanner(System.in);
	    	int a[][] = new int[3][3];
	    	
	    	for (int i=0;i<3;i++)
	    	{
	    		for (int j=0;j<3;j++)
	    		{
	    			System.out.println("Enter ["+i+"]["+j+"] :");
		    		a[i][j] = sc.nextInt();
	    		}
	    		
	    		
	    	}
	    	
	    	for (int i=0;i<3;i++)
	    	{
	    		for (int j=0;j<i;j++)
	    		{
	    			System.out.print(" ");
	    		}
	    		System.out.println(a[i][i]);
	    	}
	    	
	    }
	}