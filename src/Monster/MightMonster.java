package Monster;

public abstract class MightMonster extends Monster {

    private int ragePoints;
    private int maxRP;

    public MightMonster(int maxRP, int maxHP) {
        super(maxHP);
        this.maxRP = maxRP;
    }

    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int ragePoints) {
        this.ragePoints = ragePoints;
    }

    public void restoreRp(int ragePoints) {


        if (ragePoints<maxRP && ragePoints+ ragePoints<=maxRP){
            ragePoints += ragePoints;
        } else {
            System.out.println("can not do healing");
        }

    }

    public boolean useRp(int rp) {

        if (rp <= maxRP - ragePoints){
            ragePoints = maxRP - rp;
            return true;
        }
        return false;

    }


}
