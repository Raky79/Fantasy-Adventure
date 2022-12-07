import org.junit.Before;
import org.junit.Test;
import player.Healer;
import weapons.HealingTool;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;

    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool("Heals r' us", "heals allied players", 750);
        healer = new Healer("Eison", "Elf", 20000, 21, healingTool);
    }

    @Test
    public void healerHasAName() {
        assertEquals("Eison", healer.getName());
    }

    @Test
    public void healerHasARace() {
        assertEquals("Elf", healer.getRace());
    }

    @Test
    public void healerHasAHealth() {
        assertEquals(20000, healer.getHealth());
    }

    @Test
    public void healerHasALevel() {
        assertEquals(21, healer.getLevel());
    }

    @Test
    public void healerHasHealingTool() {
        assertEquals("Heals r' us", healer.getHealingToolName());
        assertEquals("heals allied players", healer.getHealingToolDescription());
        assertEquals(750, healer.getHealingToolHealing());
    }
}
