package collectiontopic;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementApplication {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        ArrayList<Employee> employeeList = new ArrayList<>();
	        Employee emp = null;
	        int choice = 0;

	        do {
	            System.out.println("Enter below choice:");
	            System.out.println("1) Insert Employee");
	            System.out.println("2) Update Employee By ID");
	            System.out.println("3) Delete Employee By ID");
	            System.out.println("4) Display All Employee Records");
	            System.out.println("5) Search Employee by Name");
	            System.out.println("6) Exit");
	          
	            choice = sc.nextInt();
	            sc.nextLine(); 
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter Employee ID:");
	                    int id = sc.nextInt();
	                    sc.nextLine();  
	                    System.out.println("Enter Employee Name:");
	                    String name = sc.nextLine();
	                    System.out.println("Enter Employee Salary:");
	                    double salary = sc.nextDouble();
	                    sc.nextLine(); 
	                    System.out.println("Enter Employee Designation:");
	                    String dsgn = sc.nextLine();
	                    System.out.println("Enter Organization Name:");
	                    String orgName = sc.nextLine();

	                    emp = new Employee(id, name, salary, dsgn, orgName);
	                    employeeList.add(emp);
	                    System.out.println("Employee record successfully inserted.");
	                    break;

	                case 2:
	                    System.out.println("Enter Employee ID to update:");
	                    int updateId = sc.nextInt();
	                    boolean updated = false;
	                    for (Employee employee : employeeList) {
	                        if (employee.getId() == updateId) {
	                            sc.nextLine(); 
	                            System.out.println("Enter New Name:");
	                            employee.setName(sc.nextLine());
	                            System.out.println("Enter New Salary:");
	                            employee.setSalary(sc.nextDouble());
	                            sc.nextLine(); 
	                            System.out.println("Enter New Designation:");
	                            employee.setDsgn(sc.nextLine());
	                            System.out.println("Enter New Organization Name:");
	                            employee.setOrgName(sc.nextLine());
	                            updated = true;
	                            System.out.println("Employee record updated.");
	                            break;
	                        }
	                    }
	                    if (!updated) {
	                        System.out.println("Employee with ID " + updateId + " not found.");
	                    }
	                    break;

	                case 3:
	                    System.out.println("Enter Employee ID to delete:");
	                    int deleteId = sc.nextInt();
	                    boolean deleted = false;
	                    for (Employee employee : employeeList) {
	                        if (employee.getId() == deleteId) {
	                            employeeList.remove(employee);
	                            deleted = true;
	                            System.out.println("Employee record deleted.");
	                            break;
	                        }
	                    }
	                    if (!deleted) {
	                        System.out.println("Employee with ID " + deleteId + " not found.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("ID\tName\tSalary\tDesignation\tOrganization");
	                    for (Employee e : employeeList) {
	                        System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary() + "\t" + e.getDsgn() + "\t" + e.getOrgName());
	                    }
	                    break;

	                case 5:
	                    System.out.println("Enter Employee Name to search:");
	                    String searchName = sc.nextLine();
	                    boolean found = false;
	                    for (Employee employee : employeeList) {
	                        if (employee.getName().equalsIgnoreCase(searchName)) {
	                            System.out.println("Employee Found: ");
	                            System.out.println("ID: " + employee.getId());
	                            System.out.println("Name: " + employee.getName());
	                            System.out.println("Salary: " + employee.getSalary());
	                            System.out.println("Designation: " + employee.getDsgn());
	                            System.out.println("Organization: " + employee.getOrgName());
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found) {
	                        System.out.println("Employee with Name " + searchName + " not found.");
	                    }
	                    break;

	                case 6:
	                    System.out.println("Exiting application...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	                    break;
	            }
	        } while (choice != 6);

	        sc.close();
	    }

}