package bookchapter.chapter6.student;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Petros", "Petrosyan", "032145678", "Java");
        student.age = 20;
        System.out.println(student.printStudentFull());


        Student student1 = new Student("Petros", "Petrosyan", "032148796", "Java");
        System.out.println(student1.printStudentShort());

    }
}
