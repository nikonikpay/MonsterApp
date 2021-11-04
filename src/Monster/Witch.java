package Monster;

public class Witch extends MagicMonster {

    private String name;


    public Witch() {
        this("Durian", 8, 20);

    }

    public Witch(int hitPoints, int magicPoints) {

        this("Durian", hitPoints, magicPoints);
    }

    public Witch(String name, int hitPoints, int magicPoints) {
        super(magicPoints, hitPoints);
        this.name = name;
        super.setHitPoints(hitPoints);
        super.setMagicPoints(magicPoints);

    }

    public int fireballAttack() {

        // cost 5 mp - 8 damage
        super.useMp(5);

        return super.getHitPoints();

    }


}
