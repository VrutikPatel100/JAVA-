package innerclasstopic.mi;

public class A 
{
		
	private int no = 100;
	
	class B
	{
		void show()
		{
			System.out.println("no :- "+no);		
		}
	}
	public static void main(String [] args)
	{
		A objA = new A();
		
		A.B objB = objA.new B();
		
		objB.show();
	}

}


