package string;

public class TestApp1 {
	
	public static void main(String [] args) {
		
		String name1 = "royal";
		
		String name2 = "royal";
		String name3 = "royal";
		String name4 = "royallllpatel";
		
		System.out.println("name1.equals(name2) : " + name1.equals(name2));
		System.out.println("name1.equals(name3) : " + name1.equals(name3));
		System.out.println("name1.equalsIgnoreCase(name3) : " + name1.equalsIgnoreCase(name3));
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("name1.compareTo(name2) : " + name1.compareTo(name2));
		System.out.println("name1.compareTo(name3) : " + name1.compareTo(name3));
		System.out.println("name1.compareToIgnoreCase(name3) : " + name1.compareToIgnoreCase(name3));
		System.out.println("name1.compareTo(name4) : " + name1.compareTo(name4));
	}

}
