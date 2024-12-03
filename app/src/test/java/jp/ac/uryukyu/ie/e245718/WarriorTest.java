package jp.ac.uryukyu.ie.e245718;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    public void testAttackWithWeaponSkill() {
        int Slimehp = 50;
        Warrior warrior = new Warrior("ウォリアーリオ", 100, 20);
        Enemy enemy = new Enemy("スライム",Slimehp, 10);

        int expectedDamage = (int) (warrior.attack * 1.5);

        warrior.attackWithWeaponSkill(enemy);
        assertEquals(expectedDamage, Slimehp-enemy.getHitPoint());
        
    }
}
