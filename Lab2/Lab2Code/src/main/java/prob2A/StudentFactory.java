package prob2A;

public class StudentFactory {
    //    Using external Factory to create the Objects
    public static Student createStudent(String name, String grade) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null");
        }
        if (grade.isEmpty()) {
            throw new IllegalArgumentException("Grade cannot be null");
        }
        Student student = new Student(name);
        GradeReport gradeReport = new GradeReport(grade, student);
        student.setGradeReport(gradeReport);
        return student;
    }
}
