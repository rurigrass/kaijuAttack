import Army.Tank;
import Monsters.KingKong;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;

    @Before
    public void before() {
        tank = new Tank("Tank", 10, 6);
    }

    @Test
    public void canGetName(){
        assertEquals("Tank", tank.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(10, tank.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(6, tank.getAttackValue());
    }

}
