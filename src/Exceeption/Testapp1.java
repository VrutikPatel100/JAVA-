package Exceeption;
class A{}
class B extends A{}
class C extends A{}

public class Testapp1
{	
	public static void main(String [] args)
	{
		
		//->>arithmetic exception
		
//		int a=10/0;
//		
//		System.out.println("a:-" + a);
		
		
		//->>>  null exception
		
//		String name = null;
//		System.out.println("name.length()" + name.length());
		
		
		
		//indexoutofboundexception
		
//		String name = "vrutik";
//		System.out.println("name" + name.charAt(6));
		
		
		//Arrayindexoutofboundexception
		
//		int a[] = new int [5];
//		a[5] = 50;
//		System.out.println("a" + a);
		
		
		//raice classexception
		
		A obja = new B();
		C objc = (C)obja;
		
		String value = "123";
		int no = Integer.parseInt(value);
		System.out.println("no:-" + no);
		
		
	}
	
	

}
