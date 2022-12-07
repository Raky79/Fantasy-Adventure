import org.junit.Before;
import org.junit.Test;
import player.Caster;
import weapons.Staff;

import static org.junit.Assert.assertEquals;

public class CasterTest {

    Caster caster;

    Staff staff;

    @Before
    public void before(){
        staff = new Staff("Fire Stick", "Throws fire at enemies", 1600);
        caster = new Caster("Gandalf", "Human", 35000, 54, staff);
    }

    @Test
    public void casterHasName() {
        assertEquals("Gandalf", caster.getName());
    }

    @Test
    public void casterHasARace() {
        assertEquals("Human", caster.getRace());
    }

    @Test
    public void casterHasHealth() {
        assertEquals(35000, caster.getHealth());
    }

    @Test
    public void casterHasLevel() {
        assertEquals(54, caster.getLevel());
    }

    @Test
    public void casterHasStaff() {
        assertEquals("Fire Stick", caster.getStaffName());
        assertEquals("Throws fire at enemies", caster.getStaffDescription());
        assertEquals(1600, caster.getStaffDamage());
    }
}
