package Monster;

public abstract class MagicMonster extends Monster {

    private int magicPoints;
    private int maxMP;

    public MagicMonster(int maxMP, int maxHP) {
        super(maxHP);
        this.maxMP = maxMP;
    }


    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public void restoreMp(int heal) {

        if (magicPoints<maxMP && magicPoints+ heal<=maxMP){
            magicPoints += heal;
        } else {
            System.out.println("can not do healing");
        }

    }

    public boolean useMp(int usedMp) {

        if (maxMP - magicPoints >=0){
            magicPoints -= usedMp;
            return true;
        }
        return false;

    }

}
