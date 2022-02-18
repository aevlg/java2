package lesson1;

public class Humon  {
    private String teamName;
    private Skills[] skills;

    public Humon (String teamName, Skills[] skills){
        this.teamName = teamName;
        this.skills = skills;

    }


    public String getTeamName() {
        return teamName;
    }


    public Skills[] getSkills() {
        return skills;
    }
}

