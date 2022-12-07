import org.junit.Before;
import org.junit.Test;
import player.Melee;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class MeleeTest {

    Weapon weapon;

    Melee melee;

    @Before
    public void before() {
        weapon = new Weapon("sword", "pointy thing", 1200);
        melee = new Melee("Razum Dar", "Elf", 24000, 1, 340, weapon);
    }

    @Test
    public void meleeHasName() {
        assertEquals("Razum Dar", melee.getName());
    }

    @Test
    public void meleeHasRace() {
        assertEquals("Elf", melee.getRace());
    }

    @Test
    public void meleeHasHealth() {
        assertEquals(24000, melee.getHealth());
    }

    @Test
    public void meleeHasLevel() {
        assertEquals(1, melee.getLevel());
    }

    @Test
    public void meleeHasStrength() {
        assertEquals(340, melee.getStrength());
    }

    @Test
    public void meleeHasWeapon() {
        assertEquals("sword", melee.getWeaponName());
        assertEquals("pointy thing", melee.getWeaponDescription());
        assertEquals(1200, melee.getWeaponDamage());
    }


}
