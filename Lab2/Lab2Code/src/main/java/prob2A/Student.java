package prob2A;

public class Student {
    String name;
    GradeReport gradeReport;

    //    Access set to package level so that the object can only be created using static factory class Methods
    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public void setGradeReport(GradeReport gradeReport) {
        this.gradeReport = gradeReport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeReport=" + gradeReport.getGrade() +
                '}';
    }
}
