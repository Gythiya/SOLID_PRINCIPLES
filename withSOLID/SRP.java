package withSOLID;

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
}

class Teacher {

    void assignMarks(Student student, int marks) {
        System.out.println(student.name + " received marks: " + marks);
    }
}

public class SRP {

    public static void main(String[] args) {

        Student student = new Student("Gythiya");
        Teacher teacher = new Teacher();

        student.doHomework();
        student.doProject();

        teacher.assignMarks(student, 85);
    }
}
