
package innerclasstopic.ai;

import innerclasstopic.mi.A;

public class Testapp1 {
	public static void main(String [] args)
	{
		A obj = new A()
		{
			public void test1()
			{
				System.out.println("TestApp1---test1()");
			}
		};		
		obj.test1();
	}
}