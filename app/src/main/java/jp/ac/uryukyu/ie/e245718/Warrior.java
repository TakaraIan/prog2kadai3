package jp.ac.uryukyu.ie.e245718;

public class Warrior extends Hero {

    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent) {
        if (!isDead()) {
            // attackの150%のダメージを与える
            int damage = (int) (attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    @Override
    public void woundedMessage() {
        System.out.printf("勇者%s（ウォリアー）は道半ばで力尽きてしまった。\n", getName());
    }

    public double getAttack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAttack'");
    }
}
