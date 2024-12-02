package jp.ac.uryukyu.ie.e245718;

public class Enemy extends LivingThing {

    public Enemy(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);  // 親クラスのコンストラクタを呼び出し
    }

    @Override
    public void woundedMessage() {
        System.out.printf("モンスター%sは倒れた。\n", getName());
    }
}
