
package string;

import java.util.Scanner;
public class Reverce {


public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
		String nm = new String();
		System.out.println("Enter Any character:");
		nm = sc.nextLine();
		//Now we have to convert String to char array
		char nm2[] = nm.toCharArray();
		for (int i = 0; i < nm2.length - 1; i++) {
		    for (int j = 0; j < nm2.length - 1 - i; j++) {
		        if (nm2[j] > nm2[j + 1]) {
		            char temp = nm2[j];
		            nm2[j] = nm2[j + 1];
		            nm2[j + 1] = temp;
		        }
		    }
		}
		String sort = new String(nm2);
		System.out.println("character After Sorting: " + sort);
	}
}
}