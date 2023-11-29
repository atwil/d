import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentRegistrationSystem registrationSystem = new StudentRegistrationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Registration System");
            System.out.println("1. Register Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String FirstName = scanner.next();
                    System.out.print("Enter last name: ");
                    String LastName = scanner.next();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter student ID: ");
                    int ID = scanner.nextInt();
                    System.out.println("Enter student UID: ");
                    int UID = scanner.nextInt();
                    System.out.println("Enter LastSemesterGPA:");
                    int LastSemesterGPA = scanner.nextInt();
                    student student = new student(FirstName, LastName, age, ID, UID, LastSemesterGPA);
                    registrationSystem.registerStudent(student);
                    break;
                case 2:
                    registrationSystem.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}






