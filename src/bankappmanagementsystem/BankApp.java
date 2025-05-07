package bankappmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nBank Application Menu");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Delete Account");
            System.out.println("6. View All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccount();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    deleteAccount();
                    break;
                case 6:
                    viewAllAccounts();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        accounts.add(new Account(accNo, name, amount));
        System.out.println("Account created successfully!");
    }

    private static void viewAccount() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();
        
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                System.out.println(acc);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    private static void depositMoney() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                acc.deposit(amount);
                System.out.println("Deposit successful!");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    private static void withdrawMoney() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                if (acc.withdraw(amount)) {
                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Insufficient balance!");
                }
                return;
            }
        }
        System.out.println("Account not found!");
    }

    private static void deleteAccount() {
        System.out.print("Enter account number to delete: ");
        String accNo = scanner.nextLine();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accNo)) {
                accounts.remove(i);
                System.out.println("Account deleted successfully!");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    private static void viewAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        
        System.out.println("\nAll Accounts:");
        for (Account acc : accounts) {
            System.out.println(acc);
            System.out.println("------------------");
        }
    }
}