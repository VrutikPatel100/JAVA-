package collectiontopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp2 {
	public static void main(String [] args)
	{
		ArrayList<String> listofName = new ArrayList<String>();
		
		listofName.add("vrutik");
		listofName.add("yash");
		listofName.add("jalay");
		listofName.add("tithi");
		
		ListIterator<String> litr = listofName.listIterator();
		
		while(litr.hasNext())
		{
			String name = litr.next();
			System.out.println(name);
		}
		
		System.out.println("----------------------------");
		
		while(litr.hasPrevious())
		{
			String name = litr.previous();
			System.out.println(name);
		}
	}
}
