package inheritance;
import java.util.Scanner;

public class Employe extends Person{
	
	int id;
	int salary;
	String dsgn;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Employe e = new Employe();
		
		System.out.print("ENter Employee Id:-");
		e.id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter name:-");
		e.name = sc.nextLine();
		
		System.out.print("ENter Employee salary:-");
		e.salary = sc.nextInt();
		sc.nextLine();
		System.out.print("ENter Employee dsgn:-");
		e.dsgn = sc.nextLine();
		
		System.out.println(e.id+ " " + e.name + " " + e.salary + " " + e.dsgn);
		
	}

}
