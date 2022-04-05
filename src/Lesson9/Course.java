package Lesson9;
import java.util.List;

public class Course {
    private String nameCourse;
    List<Student> studentList;

    public Course(String nameCourse, List<Student> studentList){
        this.nameCourse =nameCourse;
        this.studentList = studentList;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
