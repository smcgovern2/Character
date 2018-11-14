package Character.Test;
import org.junit.Before;
import Character.*;
import static org.junit.Assert.*;
public class StarvingTest {

    CharacterGeneric tim;
    @Before
    public void setUp(){
        tim = new BasicCharacter("Tim");
        tim = new Starving(tim);
    }

    @org.junit.Test
    public void getName() {
        assertTrue(tim.getName().contains("The Hungry"));
    }

    @org.junit.Test
    public void getHealth() {
        assertEquals(tim.getHealth(),-9);
    }
}