package collectiontopic;

import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String [] args)
	{
		ArrayList list = new ArrayList();
		
		list.add("vrutik");
		list.add(12);
		list.add("r");
		list.add(12L);
		list.add(34.654f);
		list.add(564.324);
		
		Student s1 =new Student(1 , "vrutik" , 24);
		
		list.add(s1);
		
		System.out.println("list.size():-" + list.size());
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if (obj instanceof Student)
			{
				Student s = (Student)obj;
				s.disp();
			}else
			{
				System.out.println(obj);
			}
		}
//		for (Object obj : list)
//		{
//			if (obj instanceof Student)
//			{
//				Student s = (Student)obj;
//				s.disp();
//			}else
//			{
//				System.out.println(obj);
//			}
//		}
//		for(int i = 0 ; i< list.size() ; i++)
//		{
//			System.out.println("list.get("+i+") :- " list.get(i));
//		}
	}
}

		