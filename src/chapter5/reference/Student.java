package chapter5.reference;

public class Student {
    int studentId;
    String studentName;

    Subject korean;
    Subject math;

    public Student() {
        korean = new Subject("국어");
        math = new Subject("수학");
    }

    public Student(int id, String name) {
        studentId = id;
        studentName = name;
        korean = new Subject("국어");
        math = new Subject("수학");
    }

    public void setKorean(int score) {
        korean.setSubjectScore(score);
    }

    public void setMath( int score) {
        math.setSubjectScore(score);
    }

    public void showStudentInfo() {
        int total = korean.getSubjectScore() + math.getSubjectScore();
        System.out.println(studentName + " 학생의 총점은" + total + "입니다.");
    }
}
