package gb.ls2.team;

public class Skills {


    protected String name; //имя
    private int maxRun;
    private int maxSwim;
    private int maxJump;//ВЫСОТА ПРИПЯТСТВИЯ


public Skills(
    String name,
    int maxRun,
    int maxSwim,
    int maxJump


)
{
    this.name = name;
    this.maxRun = maxRun;
    this.maxSwim = maxSwim;
    this.maxJump = maxJump;



}
public String getName(){
    return this.name;
}
    public int getMaxRun(){
    return  this.maxRun;
}
    public int getMaxSwim(){
    return this.maxSwim;
}
    public int getMaxJump(){
    return this.maxJump;
}


//    protected boolean run(int distance) {
//        return (distance <= maxRun);
//    }
//
//    protected boolean swim(int distance) {
//        return (distance <= maxSwim) ;
//    }
//
//    protected boolean jump (int distance) {
//        return (distance <= maxJump) ;
//    }


}


