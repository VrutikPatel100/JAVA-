package polymorphism;

import java.util.Scanner;

public class Testapp1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter below choice : ");
        System.out.println("1) For TwVehicle");
        System.out.println("2) For LmvVehicle");
        System.out.println("3) For HmvVehicle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                TwVehicle tw = new TwVehicle();
                tw.getSpec();
                break;
            case 2:
                LmVehicle lmv = new LmVehicle();
                lmv.getSpec();
                break;
            case 3:
                HmvVehicle hmv = new HmvVehicle();
                hmv.getSpec();
                break;
        }
    }
}
