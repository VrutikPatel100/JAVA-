package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student1 {
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
	
		try {
			FileOutputStream fout =new FileOutputStream("Student1tx.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
			out.close();
			fout.close();
			
			System.out.println("success");
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}