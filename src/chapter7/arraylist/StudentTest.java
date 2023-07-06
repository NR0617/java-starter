package chapter7.arraylist;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 80);

        studentLee.showStudentInfo();

        Student studentJae = new Student(1002, "Jae");
        studentJae.addSubject("국어", 80);
        studentJae.addSubject("수학", 80);

        studentJae.showStudentInfo();

    }
}
