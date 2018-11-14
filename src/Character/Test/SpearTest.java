package Character.Test;
import org.junit.Before;
import Character.*;
import static org.junit.Assert.*;
public class SpearTest {

    CharacterGeneric tim;
    @Before
    public void setUp(){
        tim = new BasicCharacter("Tim");
        tim = new Spear(tim);
    }

    @org.junit.Test
    public void getName() {
        assertTrue(tim.getName().contains("The Spear Thrower"));
    }

    @org.junit.Test
    public void getHealth() {
        assertEquals(tim.getHealth(),5);
    }
}