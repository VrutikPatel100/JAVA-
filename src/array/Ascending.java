package array;
import java.util.Scanner;
public class Ascending {
    public static void main(String[] args) {
    	int arr[] = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
        	System.out.print("enter A ["+i+"]:-"+ "");
        	arr[i] = sc.nextInt();        	
        }
        for(int i = 0;i < arr.length; i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		int temp = 0;
        		if(arr[i] > arr[j])
        		{
        			temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        	System.out.println(arr[i]);
        }
        sc.close();
    }
}