package oops;

import java.util.Scanner;

public class Student2 {
	int rno,std;
	String name;	
	public void scandata()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Rno:-");
		rno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter name:-");
		name = sc.nextLine();
		
		System.out.print("Enter Std:-");
		std = sc.nextInt();
	}
	// dispdata method
	public void dispdata()
	{
		System.out.println(rno + " " + name + " " + std);
	}
	public static void main(String[] args)
	{
		//class type variable ----> object		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();		
		Student s[] = new Student[5];
		
		for(int i = 0; i<s.length ; i++)
		{
			s[i] = new Student();
			s[i].scandata();
		}
		for(int i = 0; i< s.length ; i++)
		{
			s[i].dispdata();
		}
	}
}
