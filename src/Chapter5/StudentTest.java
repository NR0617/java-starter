package Chapter5;

public class StudentTest {
    public static void main(String[] args) {

        int i = 10;

        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.studentId = 100;
        studentLee.address = "강남구";

        Student studentJang = new Student();
        studentJang.studentName = "장보고";
        studentJang.studentId = 200;
        studentJang.address = "성남시";

        studentLee.showStudentInfor();
        studentJang.showStudentInfor();

        System.out.println(studentJang);
        System.out.println(studentLee);

    }
}
