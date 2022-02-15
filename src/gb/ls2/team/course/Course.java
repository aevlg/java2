package gb.ls2.team.course;

import gb.ls2.team.Humon;
import gb.ls2.team.Skills;

public class Course {

    String result;
    private int run;
    private int swim;
    private int jump;

    public Course(int run,
                  int swim,
                  int jump){
        this.run = run;
        this.swim = swim;
        this.jump = jump;

    }

    public String doIt(Humon humon) {
        result = "КОМАНДА:" + humon.getTeamName() + " " + '\n';
        for (Skills skills : humon.getSkills()) {
            result += "ИМЯ: " + skills.getName() + " " + '\n';



            int distanceRun = skills.getMaxRun();
            testRun(distanceRun);
            int distanceSwim = skills.getMaxSwim();
            testSwim(distanceSwim);
            int distanceJump = skills.getMaxJump();
            testJump(distanceJump);

        }
        return result;
    }
    private void testRun(int distanceRun){
        if(distanceRun <= run) result += "ПРОБЕЖАЛ ДИСТАНЦИЮ  "+ '\n';

    }

    private void testSwim(int distanceSwim){
        if(distanceSwim <= swim ) result += "ПРОПЛЫЛ ДИСТАНЦИЮ "+ '\n';

    }

    private void testJump(int distanceJump){
        if(distanceJump <= swim ) result += "ПЕРЕПРЫГНУЛ ПРИПЯТСТВИЕ  "+ '\n';

    }




//    protected int testRun(int distanceRun){
//        return (distanceRun <= run);
//            result += "ПРОБЕЖАЛ ДИСТАНЦИЮ "+ '\n';
//    }
//
//    protected void testSwim(int distanceSwim){
//        if(distanceSwim<swim ) result += "ПРОПЛЫЛ ДИСТАНЦИЮ  "+ '\n';
//
//    }
//
//    private void testJump(int distanceJump){
//        if(distanceJump<jump ) result += "ПЕРЕПРЫГНУЛ ПРИПЯТСТВИЕ "+ '\n';
//
//    }
}







