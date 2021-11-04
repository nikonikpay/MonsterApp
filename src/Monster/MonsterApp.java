package Monster;

public class MonsterApp {

    public static void main(String[] args) {
         Witch witch = new Witch(30,100);
        Bear bear = new Bear(50,5);

        witch.setHitPoints(30);
        witch.setMagicPoints(100);
        bear.setHitPoints(50);
        bear.setRagePoints(5);

         witch.fireballAttack();
         System.out.println(bear.getHitPoints());
         bear.takeDamage(8);

        System.out.println(bear.getHitPoints());
        System.out.println(witch.getMagicPoints());

        bear.bearClawAttack();
        witch.takeDamage(10);
        witch.useMp(15);

        System.out.println(witch.getHitPoints());
        System.out.println(witch.getMagicPoints());
        System.out.println(witch.getMaxHP());

        witch.restoreMp(10);
        System.out.println(witch.getMagicPoints());
        System.out.println(bear.getRagePoints());

        bear.restoreRp(6);
        System.out.println(bear.getRagePoints());





    }

}
