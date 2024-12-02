package jp.ac.uryukyu.ie.e245718;

public class Hero extends LivingThing {

    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void woundedMessage() {
        System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
    }
}
