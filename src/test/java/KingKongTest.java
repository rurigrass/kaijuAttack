import Monsters.KingKong;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KingKongTest {

    KingKong kingKong;

    @Before
    public void before() {
        kingKong = new KingKong("King Kong", 10, 4, "flies");
    }

    @Test
    public void canGetName(){
        assertEquals("King Kong", kingKong.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(10, kingKong.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(4, kingKong.getAttackValue());
    }

    @Test
    public void canFly(){
        assertEquals("King Kong flies!", kingKong.makeFly());
    }
}
