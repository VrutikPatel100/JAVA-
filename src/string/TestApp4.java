package string;

public class TestApp4 {
	public static void main(String [] args)
	{
		String name1 = "Royal";
		String name2 = "Royal";
		String name3 = "Techno";
		String name4 = name1;
		
		String name5 = name1 + " " + name3;
		System.out.println("name1==name2 : " + (name1 == name2));
		System.out.println("name1==name3 : " + (name1 == name3));
		System.out.println("name3==name4 : " + (name3 == name4));
		
		System.out.println("name1.equals(name2)" + name1.equals(name2));
		System.out.println("name1.equals(name3)" + name1.equals(name3));
		System.out.println("name3.equals(name4)" + name3.equals(name4));
		
		String name7 = "royal";
		String name8 = new String("royal");
		
		System.out.println("name7==name8 : " + (name7 == name8));
		System.out.println("name7,equals(name8) : " + name7.equals(name8));
	}

}
