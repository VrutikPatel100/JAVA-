package javamain;
import java.util.Scanner;
public class Switchcalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int num1 , num2,ch;
		
		System.out.print("enter num1:-");
		num1 = sc.nextInt();
		
		System.out.print("enter num2:-");
		num2 = sc.nextInt();
		
		System.out.println("****MENU****");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVITION");
		System.out.println("ENTER CHOICE:-");
		
		ch=sc.nextInt();
		switch(ch)
		{
		
			case 1: System.out.println("ADDITION:-"+(num1+num2));
			break;
			
			case 2: System.out.println("SUBTRACTION:-"+(num1-num2));
			break;
			
			case 3: System.out.println("MULTIPLICATION:-"+(num1*num2));
			break;
			
			case 4: System.out.println("DIVITION:-"+(num1/num2));
		}
		sc.close();
	}	
}
