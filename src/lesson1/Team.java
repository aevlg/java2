package lesson1;


import lesson1.course.Course;

public class Team {
    public static void main(String[] args) {

        Skills[] skills = new Skills[4];
        skills[0] = new Skills("Лина", 350, 200, 55);
        skills[1] = new Skills("Сережа", 400, 200, 100);
        skills[2] = new Skills("Алла", 250, 300, 350);
        skills[3] = new Skills("Костя", 350, 200, 50);

        Humon humon = new Humon("ПЕРЧИКИ", skills);


        Course course = new Course(300, 150, 50);

        String result = course.doIt(humon);
        System.out.println(result);


    }
}









