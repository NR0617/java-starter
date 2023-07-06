package chapter5.reference;

public class StudentTest {
    public static void main(String[] args) {
        Student James = new Student(100, "James");
        James.setKorean(100);
        James.setMath(100);

        Student Tomas = new Student(101, "Tomas");
        Tomas.setKorean( 70);
        Tomas.setMath( 70);

        James.showStudentInfo();
        Tomas.showStudentInfo();
    }
}
