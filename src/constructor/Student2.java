package constructor;

public class Student2 {
    int rno;
    int std;
    String name;

    // Constructor
    public Student2(int rno, String name, int std) {
        this.rno = rno;
        this.name = name;
        this.std = std;
    }             

    // Copy constructor
    public Student2(Student2 s) {  // Corrected Student to Student2
        System.out.println("Before copy constructor----");
        this.rno = s.rno;
        this.name = s.name;
        this.std = s.std;
        System.out.println("After copy constructor----");
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Roll No: " + rno + ", Name: " + name + ", Standard: " + std);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2(1, "Vrutik", 12);
        Student2 s2 = new Student2(2, "Om", 11);

        System.out.println("Main Method ---- ");
        s1.printDetails();
        s2.printDetails();

        Student2 s3 = new Student2(s2);  // Corrected Student+ to Student2
        System.out.println("Main Method ---- ");
        s3.printDetails();
    }
}
