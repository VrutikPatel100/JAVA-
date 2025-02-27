package oops;
import java.util.Scanner;
public class Basic {

//		1) data members -->store-->data-->into-->data members
	int rno,std;
	String name;
	public static void main(String args[])
	{
		//class type variable-->object
		Basic s = new Basic();
		//s=>reference variable
		//Student => object
		
		System.out.println("s===> " + s);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter rno : ");
		s.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("enter name : ");
		s.name = sc.nextLine();
		
		System.out.println("enter std : ");
		s.std = sc.nextInt();
		
		System.out.println(s.rno+" "+ s.name+ " "+ s.std);
		}
}







































































