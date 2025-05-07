package CollectionSorting;

public class Student implements Comparable<Student> {

	private int rno,std;
	private String name;
	
	public Student(int rno,String name ,int std )
	{
		this.rno=rno;
		this.name=name;
		this.std=std;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void disp()
	{
		System.out.println(rno + " " + name + " " + std);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	public int compareTo(Student s2)
//	{
//		return getName().compareTo(s2.getName());
//	}
	
	
}