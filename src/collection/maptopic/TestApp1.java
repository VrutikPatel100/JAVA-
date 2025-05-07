//package collection.maptopic;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class TestApp1 {
//	public static void main(String [] args)
//	{
//		HashMap<Integer , String> mapobj = new HashMap<>();
//		
//		mapobj.put(24,"vrutik");
//		mapobj.put(21,"jalay");
//		mapobj.put(13,"guru");
//		mapobj.put(47,"jalp");
//		mapobj.put(50,"mitul");
//		
//		for(Map.Entry<Integer , String> e : mapobj.entrySet())
//		{
//			System.out.println(e.getKey() + " " + e.getValue());
//		}
// 	}
//}


package collection.maptopic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestApp1 {
	public static void main(String [] args)
	{
		TreeMap<Integer,String> mapobj = new TreeMap<>();

		
		mapobj.put(24,"vrutik");
		mapobj.put(21,"jalay");
		mapobj.put(13,"guru");
		mapobj.put(47,"jalp");
		mapobj.put(50,"mitul");
		
		for(Map.Entry<Integer , String> e : mapobj.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
 	}
}
