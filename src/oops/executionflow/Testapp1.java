package oops.executionflow;

public class Testapp1 {

	  int no;

	    // 1) Static Block
	    static {
	        System.out.println("1)------Static Block------");
	    }

	    // Instance Block
	    {
	        System.out.println("4)------Instance Block------" + this);
	        no = 100;
	    }

	    // Default Constructor
	    public Testapp1() {
	        System.out.println("5)------Default Constructor------" + this);
	    }

	    // Par Constructor
	    public Testapp1(int no) {
	        System.out.println("6)------Para Constructor------" + this);
	    }
	    // Static test2()--method
	    public static void test1() {
	        System.out.println("3) ------Static test1()--method------");
	    }
	    // Non-Static test2()--method
	    public void test2() {
	        System.out.println("6). ------Non-Static test2()--method------" + this);
	        System.out.println("No : " + no);
	    }
	    // 2) main method
	    public static void main(String[] args) {
	        System.out.println("2)---START : main Method-----");
	        Testapp1.test1();
	        Testapp1 obj1 = new Testapp1();
	        obj1.test2();
	        Testapp1 obj2 = new Testapp1();
	        obj2.test2();
	        System.out.println("7)EXIT : main Method----");
	    }
	}