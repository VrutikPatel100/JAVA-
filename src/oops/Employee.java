package oops;
import java.util.Scanner;
public class Employee {
	int id,salary;
	String name,dsgn,orgname;
	
	public static void main(String args[])
	{
		//class type variable-->object
		Employee e = new Employee();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter id :- ");
		e.id = sc.nextInt();
		System.out.print("enter salary :- ");
		e.salary = sc.nextInt();
		sc.nextLine();
		System.out.print("enter name :- ");
		e.name = sc.nextLine();
		System.out.print("enter dsgn :- ");
		e.dsgn = sc.nextLine();
		System.out.print("enter orgname :- ");
		e.orgname = sc.nextLine();

		System.out.print("\n:- ");

		
		System.out.println(e.id+" "+e.salary+" "+e.name+" "+e.dsgn+" "+e.orgname);
		
	}	
}