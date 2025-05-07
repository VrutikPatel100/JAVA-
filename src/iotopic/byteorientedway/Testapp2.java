package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Testapp2 {
	
	public static void main(String [] args)
	{
		Object sb;
		StringBuilder SB = new StringBuilder();
		try {
				FileInputStream fin = new FileInputStream("C:\\Users\\vrutik patel\\eclipse-workspace\\Testapp1\\test1.txt");
			
	//			int temp = fin.read();
	//			char value = (char)temp;
	//			System.out.println(temp + "----"+value);
				
				int temp;
				
				while( (temp = fin.read()) != -1)
				{
					SB.append((char)temp);
				}
		  }catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		System.out.println("Final String :- " + SB.toString());
			
	}
}


