package collectiontopic;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagementApplication3 {
	
	private static final int Rno = 0;

	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = null;
		int choice = 0;
		int i;
		boolean flag = false;
		do
		{
			System.out.println("enter the below choice");
			System.out.println("1) Insert Studnet...List");
			System.out.println("2) Update Student By rno...list");
			System.out.println("3) Delete Student By rno...list");
			System.out.println("4) Display All Student..list");
			System.out.println("5) Search Studnet By name..list");
			System.out.println("6) Studnet Application Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
					System.out.println("Enter Student Rno");
					int no = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter Student name");
					String name = sc.nextLine();
					
					System.out.println("Enter the Student std");
					int std = sc.nextInt();
					
				s = new Student (Rno,name,std);
					
					list.add(s);
					
					System.out.println("Student record successfully Inserted");
					break;
					
		
				
			case 2:	System.out.println("Enter the Roll Number of the student you want to update:");
			no = sc.nextInt();
			sc.nextLine();
			flag = false;

		for (i = 0; i < list.size(); i++) 
		{
			s = list.get(i);
			if (s.getRno() == no) 
			{
				flag = true;
				break;
			}
		}

		if (flag)
		{
			System.out.println("Enter new name:");
			String nameS = sc.nextLine();
			System.out.println("Enter new standard:");
			int stdS = sc.nextInt();

			
			list.get(i).setName(nameS);
			list.get(i).setStd(stdS);
		}
			break;
					
			case 3:sc.nextLine();
			
					
					System.out.println("Enter the student name which you want to remove form record");
					name = sc.nextLine();
					System.out.println("Delete name : "+ name);
					flag = false;
					for(i=0;i<list.size();i++)
					{
						s=list.get(i);
						
						if(s.getName().equalsIgnoreCase(name))
						{
							flag  =true;
							break;
							
						}
					}
					if(flag)
					{
						list.remove(i);
						System.out.println(name + "is not fonnd student records.");
					}
					break;
			case 4:
					System.out.println("Rno\t name\t std");
					
					for( i=0;i<list.size();i++)
					{
						
						s=list.get(i);
						System.out.println(s.getRno()+"\t" +s.getName()+"\t"+s.getStd());
					}
					break;
			case 5:
					break;
			case 6:
					break;
			}
			
		}while(choice != 6);
		
	}
}