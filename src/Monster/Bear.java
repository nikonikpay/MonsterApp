package Monster;

public class Bear extends MightMonster {
    private int holeNr;


    public Bear(){
        this(10);
    }

    public Bear(int hitPoints){
        this(hitPoints,10);

    }

    public Bear(int hitPoints,int ragePoints){
        super(hitPoints,ragePoints);

    }

    public Bear(int holeNr,int hitPoints,int ragePoints){
        super(ragePoints,hitPoints);
        this.holeNr = holeNr;
        super.setHitPoints(hitPoints);
        super.setRagePoints(ragePoints);


    }

    public int bearClawAttack(){

        super.useRp(8);

        return super.getHitPoints();


    }

}
