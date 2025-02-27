//package constructor;
//
//public class Student {
//	int rno,std;
//	String name;
//	
//	public Student()
//	{
//		System.out.println("Before default constructor----" + rno + " "+name+" "+std+"----"+this);
//		rno=1;
//		name="vrutik";
//		std=12;
//		System.out.println("after default constructor----"+rno+" "+name+" "+std);
//	}
//	public static void main(String[] args)
//	{
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
//		
//		System.out.println("Main Method ---- "+s1.rno+" "+s1.name+" "+s1.std+"----"+s1);
//		System.out.println("Main Method ---- "+s2.rno+" "+s2.name+" "+s2.std+"----"+s2);
//		System.out.println("Main Method ---- "+s3.rno+" "+s3.name+" "+s3.std+"----"+s3);
//	}
//}


package constructor;

public class Student{
	
	int rno,std;
	String name;
	
	public Student()
	{
		System.out.println("before default constructor-----" + rno + " " + name + " " + std +" ----"+this);
		rno=1;
		name="vrutik";
		std=12;
		System.out.println("after default constructor----"+rno+" "+name + " "+std);
	}
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println("main method ---- "+s1.rno + " "+s1.name+" "+" "+s1.std+" "+s1);
		System.out.println("main method ---- "+s2.rno + " "+s2.name+" "+" "+s2.std+" "+s2);
		System.out.println("main method ---- "+s3.rno + " "+s3.name+" "+" "+s3.std+" "+s3);
	}
}





















