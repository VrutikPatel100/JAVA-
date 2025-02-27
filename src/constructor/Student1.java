package constructor;

public class Student1 {
	int rno,std;
	String name;
	
	Student1(int r,String n,int s)
	{
		System.out.println("Before para constructor " + rno + " " + name + " " + std + "===" + this );
		
		rno=r;
		name=n;
		std=s;
		
		System.out.println("After para constructor " + rno + " " + name + " " + std + "===" + this);
	}
	
	public static void main (String args[])
	{
		// paramterrise constructor 
		
		Student1 s1 = new Student1(1,"vishvek",12);
		Student1 s2 = new Student1(2,"jalay",12);
		Student1 s3 = new Student1(1,"vrutik",12);
		
		System.out.println("main method " + s1.rno + " " + s1.name + s1.std +  " " + s1 );
		System.out.println("main method " + s2.rno + " " + s2.name + s2.std +  " " + s2 );
		System.out.println("main method " + s3.rno + " " + s3.name + s3.std +  " " + s3 );
	}
}