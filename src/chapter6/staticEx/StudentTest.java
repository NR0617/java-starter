package chapter6.staticEx;
public class StudentTest {
    public static void main(String[] args) {
        System.out.println(Student.getSerialNumber());

        Student studentJ = new Student();
        System.out.println(studentJ.studentId);
        //studentJ.serialNumber++;

        Student studentT = new Student();
        System.out.println(studentT.studentId);
        System.out.println(studentJ.getSerialNumber());
        System.out.println(studentT.getSerialNumber());


    }
}
