package Chapter5.reference;

public class Subject {
    String subjectName;
    int subjectScore;

    // 생성자 선언
    public Subject(String name) {
        subjectName = name;
    }

    public int getSubjectScore() {
        return subjectScore;
    }
    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
