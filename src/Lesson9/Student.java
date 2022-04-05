package Lesson9;
import java.util.Objects;
public class Student {
    private  String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object object){
        if (this == object )
            return true;
        if (object== null || getClass() != object.getClass())
            return false;
        Student student = (Student) object;
        return  Objects.equals(name, student.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
