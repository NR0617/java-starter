package chapter11.object;

class Student{
    int studentId;
    String studentName;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    // equals를 재정의
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            //Object 타입으로 업캐스팅 된 obj를 Student 타입으로 다운캐스팅
            Student std = (Student) obj;
            if(studentId == std.studentId)
                return true;
            else
                return false;
        }
        return false;
    }
    // 재정의-> 자바에서는 equals의 값이 같으면 hasCode의 값도 같아야 되므로 equals를 재정의하면 hasCode도 재정의 해줘야된다
    public int hashCode() {
        return studentId;
    }
}
public class EqualsTest {

    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        //System.out.println(str1 == str2); //힙메모리 주소가 같은지 비교
        //System.out.println(str1.equals(str2));

        Student student1 = new Student(1001, "홍길동");
        Student student2 = new Student(1001, "홍길동");
        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));


        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(System.identityHashCode(student2));

        //재정의된 해시코드
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        //원래 해시코드
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str1));

    }
}
