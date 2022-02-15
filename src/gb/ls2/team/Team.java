package gb.ls2.team;


import gb.ls2.team.course.Course;

public class Team {
    public static void main(String[] args) {


//
//
//        String nameTeam = "КОМАНДА-ПЕРЧИКИ";
//        String eventName;
//        String eventResult;
//        String tempWinEvent = " ДИСТАНЦИЯ ПРОЙДЕНА ";
//        String tempLossEvent = " ДИСТАНЦИЮ НЕ ПРОШЕЛ";
//        Random random = new Random();
//
//        //команда
//        skills[] skills = {
//                new skills[]
//        }
//
//
//
//
//        for (int i = 0; i < skills.length; i ++){
//
//        }
//
//        System.out.println("--------------КОМАНДА-----------------");
//        System.out.println(nameTeam);
//
//
//
//        //дистанция
//
//
//        for (int i = 0; i < skills.length; i++) {
//
//            //бег
//            String nameString = skills[i].getName() + " " +  " может ";
//            eventName = "пробежать на " + skills[i].getMaxRun() + " м. >>>>>>> пытается пробежать на ";
//            eventResult = skills[i].run(distanceRun)? tempWinEvent : tempLossEvent;
//            result(nameString, eventName, distanceRun, eventResult);
//
//
//            int swimResult = skills[i].getMaxSwim();
//            eventName = "проплыть на " + skills[i].getMaxSwim() + " м. >>>>>>> пытается переплыть на ";
//            eventResult = skills[i].swim(distanceSwim)? tempWinEvent : tempLossEvent;
//            result(nameString, eventName, distanceSwim, eventResult);
//
//
//
//            int jumpResult = skills[i].getMaxJump();
//            eventName = "прыгает на " + skills[i].getMaxJump();
//            eventResult =  skills[i].jump(distanceJump)? tempWinEvent : tempLossEvent;
//            result(nameString, eventName, distanceJump, eventResult);
//
//
//
//
//
//        }
//        System.out.println("_________________________________________");
//    }
//
//
//
//
//
//
//    private static void result(String nameTeam,
//                               String event,
//                               int eventLength,
//                               String resultEvent) {
//
//        System.out.println();
//        System.out.println(nameTeam + event + eventLength + " м " + resultEvent);
//    }
//}
//
//
//



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









