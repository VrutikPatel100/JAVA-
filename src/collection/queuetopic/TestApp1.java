package collection.queuetopic;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 {

	public static void main(String[] args)
	{
		PriorityQueue<String> queue	 = new PriorityQueue<String>();
		
		queue.add("rahul");
		queue.add("rakesh");
		queue.add("kunal");
		queue.add("aman");
		
		Iterator<String> itr = queue.iterator();
		
		while(itr.hasNext())
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}