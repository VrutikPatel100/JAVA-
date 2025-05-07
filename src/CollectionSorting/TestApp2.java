package CollectionSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import collectiontopic.Student;

public class TestApp2 {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"rahul",12);
		Student s2 = new Student(2,"brijesh",11);
		Student s3 = new Student(3,"ramesh",10);
		Student s4 = new Student(4,"sagar",9);
		Student s5 = new Student(5,"ankur",8);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
	
		for (int i = 0; i<list.size();i++)
		{
			Student s = list.get(i);
			s.disp();
		}
		System.out.println("---------------------");
		System.out.println("After Sorting");
		System.out.println("---------------------");
//		Collections.sort(list);
		
		for (int i=0;i<list.size();i++)
		{
			Student s = list.get(i);
			s.disp();
		}
	}
}