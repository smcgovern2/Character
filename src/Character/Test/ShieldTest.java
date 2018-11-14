package Character.Test;
import Character.*;
import org.junit.Before;
import static org.junit.Assert.*;
public class ShieldTest {

    CharacterGeneric tim;
    @Before
    public void setUp(){
        tim = new BasicCharacter("Tim");
        tim = new Shield(tim);
    }

    @org.junit.Test
    public void getName() {
        assertTrue(tim.getName().contains("The Shield Bearer"));
    }

    @org.junit.Test
    public void getHealth() {
        assertEquals(tim.getHealth(),15);
    }
}