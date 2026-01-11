package withoutSOLID;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void doHomework() {
        System.out.println(name + " is doing homework");
    }

    void doProject() {
        System.out.println(name + " is doing project");
    }

    // SRP Violation
    // Assigning marks is NOT a student's responsibility
    void assignMarks(int marks) {
        System.out.println(name + " received marks: " + marks);
    }
}

public class violate_SRP {
    public static void main(String[] args) {
        Student student = new Student("Gythiya");
        student.doHomework();
        student.doProject();
        student.assignMarks(85); // Wrong responsibility
    }
}
