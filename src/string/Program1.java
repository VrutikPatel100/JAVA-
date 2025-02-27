package string;

public class Program1 {
	public static void main(String[] args)
	{
		String value = " royal ";
	//	System.out.println("value.length() : " + value.trim().length());
		System.out.println("value.length() : " + value.length());
		
		for(int i=0;i<value.length();i++) {
			System.out.println(value.charAt(i));
		}
	}

}
