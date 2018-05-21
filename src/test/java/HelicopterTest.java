import Army.Helicopter;
import Monsters.Godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HelicopterTest {

    Helicopter helicopter;
    Godzilla  godzilla;

    @Before
    public void before() {
        helicopter = new Helicopter("Helicopter", 6, 7);
        godzilla = new Godzilla("Godzilla", 10, 5,"moves");
    }

    @Test
    public void canGetName(){
        assertEquals("Helicopter", helicopter.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(6, helicopter.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(7, helicopter.getAttackValue());
    }

    @Test
    public void canLoseHealth(){
        helicopter.loseHealth(godzilla);
        assertEquals(1, helicopter.getHealthValue());
    }

}
