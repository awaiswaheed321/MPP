package prob2A;

public class GradeReport {
    String grade;
    Student student;

    //    Access set to package level so that the object can only be created using static factory class Methods
    GradeReport(String grade, Student student) {
        this.grade = grade;
        this.student = student;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "grade='" + grade + '\'' +
                ", student=" + student.getName() +
                '}';
    }
}
