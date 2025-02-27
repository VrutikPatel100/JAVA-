
package javamain;

import java.util.Scanner;

public class Nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int no1, no2, no3;
        
        System.out.print("Enter no1: ");
        no1 = sc.nextInt();
        
        System.out.print("Enter no2: ");
        no2 = sc.nextInt();  
        
        System.out.print("Enter no3: ");
        no3 = sc.nextInt();  
        
        if (no1 > no2) {
            if (no1 > no3) {
                System.out.println("no1 is max");
            } else {
                System.out.println("no3 is max");
            }
        } else {
            if (no2 > no3) {
                System.out.println("no2 is max");  
            } else {
                System.out.println("no3 is max");
            }
            sc.close();
        }
        
    }
}





























