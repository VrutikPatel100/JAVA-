package collectiontopic;


import java.util.Iterator;
import java.util.LinkedList;

public class TestApp3 {
	public static void main(String [] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("vrutik");
		list.add("yash");
		list.add("jalay");
		list.add("jalp");
		list.add("tithi");
		
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}


