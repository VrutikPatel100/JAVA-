package iotopic.seri;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream; 
public class TestApp2 {
	public static void main(String [] args)
	{
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\vrutik patel\\eclipse-workspace\\Testapp1\\records.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s = (Student)oin.readObject();
			
			System.out.println(s.getRno()+ " " + s.getName() + " " + s.getStd());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
