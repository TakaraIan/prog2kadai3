
package jp.ac.uryukyu.ie.e245718;

public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public Enemy(String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void attack(Hero h) {
        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, h.getName(), damage);
        h.wounded(damage);
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public boolean isDead() {
        return dead;
    }
}
