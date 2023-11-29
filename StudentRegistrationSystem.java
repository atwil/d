import java.util.ArrayList;
import java.util.List;

public class StudentRegistrationSystem {
    private List<student> students;

    public StudentRegistrationSystem() {

         students = new ArrayList<>();
    }

    public void registerStudent(student student) {
        try {
            students.add(student);
        } catch (Exception e) {
            System.out.println("Student registered successfully!");
        }
    }

    public void displayStudents() {
        System.out.println("Registered Student:");

        for (student student : students) {

            System.out.println("FirstName: "  +  student.getFirstName()  +  " ,LastName: "  +  student.getLastName() + ", Age: " +
                    student.getAge()  +  " ID: "  +  student.getID()  +  " ,UID: " +
                    student.getUID()  +  " ,LastSemesterGPA: "  +  student.getLastSemesterGPA());

        }

    }
}






