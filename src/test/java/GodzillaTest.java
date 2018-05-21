import Army.Helicopter;
import Army.Vehicle;
import Monsters.Godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;
    Helicopter helicopter;

    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 10, 5,"moves");
        helicopter = new Helicopter("Helicopter", 6, 7);
    }

    @Test
    public void canGetName() {
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(10, godzilla.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(5, godzilla.getAttackValue());
    }

    @Test
    public void canMove(){
        assertEquals("Godzilla moves!", godzilla.makeMove());
    }

    @Test
    public void canAttack(){
        godzilla.attack(helicopter);
        assertEquals(1, helicopter.getHealthValue());
    }


}
