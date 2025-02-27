//EXCEPTION HANDALING( TRY , CATCH 
//package Test;
//
//public class ExceptionHandaling
//{
//	public static void main(String[] args)
//	{
//		System.out.println("main method started");
//		
//		int a=10,b=0,c;
//		try {
//				c=a/b;
//				System.out.println("c");
//		}
//		catch(Exception e)
//		{
//			System.out.println("can't devide by zero");
//		}
//		
//		
//	}
//	{
//		System.out.println("main method ended");
//
//	}
//}


// -----------finally

package Test;
public class ExceptionHandaling
{

	  public static void main(String[] args) 
	  {
	    try {
	      int a = 15;
	      int b = 5;

	      System.out.println("Value of  a = " + a);
	      System.out.println("Value of  b = " + b);

	      int c = a / b;
	      System.out.println("a / b = " + c);
	    } 
	    catch (Exception e) 
	    {
	      System.out.println("Exception Thrown: " + e);
	    } 
	    finally {
	      System.out.println("Finally block executed!");
	    }
	  }
	}


	

