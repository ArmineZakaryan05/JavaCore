package bookchapter.chapter6.student;

public class Student {

    String name;
    String surname;
    String phoneNumber;
    int age;
    String lessonName;
    String email;

    Student(String name, String surname, String phoneNumber, String lessonName) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.lessonName = lessonName;
    }

    String printStudentShort() {
        return "Name = " + name + " Surname = " + surname + " phoneNumber = " + phoneNumber + " lessonName" + lessonName;
    }

   String printStudentFull(){
       return "Name = " + name + ",Surname = " + surname + ",phoneNumber = " + phoneNumber + ",age = " + age + ",lessonName = " + lessonName + ",email = " + email;
   }
}
