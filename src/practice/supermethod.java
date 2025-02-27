package practice;
import java.util.Scanner;
public class supermethod extends PErson
{
	int id,salary;
	String name,dsgn;
	
	public void scandata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter id:-");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter employee name:-");
		name = sc.nextLine();
		System.out.print("enter home name:-");
		super.name = sc.nextLine();            //(super.name --> control key press kari ne name par click karvu)
		System.out.print("enter salary:-");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.print("enter dsgn:-");
		dsgn = sc.nextLine();
	}
	public void dispdata()
	{
		System.out.println(id + " " + name + " " + super.name + " " + salary + " " + dsgn);
	}
	public static void main(String[] args)
	{
		supermethod s = new supermethod();
		s.scandata();
		s.dispdata();
	}
}
