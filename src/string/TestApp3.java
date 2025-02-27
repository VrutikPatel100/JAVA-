package string;

public class TestApp3 {
	
	public static void main(String [] args) {
		
		String name1 = "royal";
		String name2 = "techno";
		String name3 = "RoyalTechno";
		
		
		System.out.println("Name1 : " + name1 +"----" + name1.hashCode());
		System.out.println("Name2 : " + name2 +"----" + name2.hashCode());
	
	name1 = name1.concat(name2);
	
	System.out.println("name1 : " + name1 + "----" + name1.hashCode());
	System.out.println("name2 : " + name2 + "----" + name2.hashCode());
	
	System.out.println(name1 == name3);
	System.out.println(name1.equals(name3));
	
	StringBuffer sb = new StringBuffer("Royal");
	
	System.out.println(sb + "----" + sb.hashCode());
	sb.append("techno");
	System.out.println(sb + "----" + sb.hashCode());
	
	}
}
