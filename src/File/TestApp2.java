package File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp2
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("");
			FileOutputStream fout = new FileOutputStream("");
			
			int temp;
			while((temp = fin.read()) != -1)
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
			fout.close();
			fin.close();
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			
		}
	}
}