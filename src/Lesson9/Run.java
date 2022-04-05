package Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args){
        List<Course> result = getListOfHouse(3, 3);

        result.stream().flatMap(course -> course.getStudentList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(course -> course.getStudentList().stream()).collect(Collectors.toSet());
        result.stream().sorted((corse1 , corse2) -> corse1.getStudentList().size() -
                corse2.getStudentList().size())
                .limit(3).collect(Collectors.toList());
        Student students = new Student("1");
        result.stream().filter(course -> course.getStudentList().contains(students))
                .collect(Collectors.toList());


        System.out.println( );

    }




    private static List<Course> getListOfHouse(int j, int m){
        ArrayList<Course> result = new ArrayList<>();
        for (int i=0; i<j ;i++){
            ArrayList<Student> students = new ArrayList<>();
            for (int h=0; h<m ;h++){
                students.add(new Student("СТУДЕНТ"+h));
            }
            result.add(new Course("КУРС"+i, students));
        }
        return result;
    }
}
