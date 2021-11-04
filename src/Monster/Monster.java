package Monster;

public abstract class Monster {


    private int hitPoints;
    private int maxHP;

    public Monster(int maxHP) {
        setMaxHP(maxHP);
    }



    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void heal(int heal){



    }


    public boolean takeDamage(int damage){

        if (hitPoints > 0){
            hitPoints  -= damage;
            return true;
        }

        return false;
    }
}
