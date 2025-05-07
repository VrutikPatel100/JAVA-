package collectiontopic;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) 
	{
		TreeSet<String> setObj = new TreeSet<>();//assending order
		
		setObj.add("jalay");
		setObj.add("nigam");
		setObj.add("vrutik");
		setObj.add("yash");
		setObj.add("tithi");
		setObj.add("vrutik");
		setObj.add("jalp");
		setObj.add("yash");
		
		Iterator<String> itr =setObj.iterator();
		
		while(itr.hasNext())
		{
			String name =(String)itr.next();
			System.out.println(name);
		}
	}	
}
