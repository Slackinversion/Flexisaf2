// Outer class: School
class School {
    private String schoolName = "Flexisaf learning"; // Private field (Access Modifier)

    // Public method to display school name
    public void showSchoolName() {
        System.out.println("School Name: " + schoolName);
    }

    // Nested class (Inner class)
    class Student {
        private String studentName; // Private field

        // Constructor for Student
        public Student(String name) {
            this.studentName = name;
        }

        // Method to display student details
        public void showStudent() {
            System.out.println("Student Name: " + studentName);
            System.out.println("Belongs to: " + schoolName); // Can access outer class private field
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        // Create an instance of School
        School mySchool = new School();
        mySchool.showSchoolName();

        // Create an instance of the nested Student class
        School.Student student1 = mySchool.new Student("Walter");
        student1.showStudent();

        // Anonymous Class Example
        Runnable greeting = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am an Intern");
            }
        };
        greeting.run(); // Calling the method of the anonymous class
    }
}
