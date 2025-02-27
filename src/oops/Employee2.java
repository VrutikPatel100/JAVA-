package oops;
import java.util.Scanner;
public class Employee2 {
	int id,salary;
	String name,desg,orgname;
	
	public void scandata()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter id:-");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter name:-");
		name = sc.nextLine();
		
		System.out.print("enter salary:-");
		salary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter desg:-");
		desg = sc.nextLine();
		
		System.out.println("enter orgname:-");
		orgname = sc.nextLine();
		
	}
	public void dispdata()
	{
		System.out.println(id + " " + name + " " + salary + " " + desg + " " + " " + orgname);
	}
	public static void main(String[] args)
	{
		Employee2 e[] = new Employee2[5];
		
		for(int i=0; i<e.length; i++)
		{
			e[i] = new Employee2();
			e[i].scandata();
		}
		for(int i=0; i<e.length; i++)
		{
			e[i].dispdata();
		}			
	}
}
