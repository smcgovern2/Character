package Character.Test;
import org.junit.Before;
import Character.*;
import static org.junit.Assert.*;
public class SwordTest {

    CharacterGeneric tim;
    @Before
    public void setUp(){
        tim = new BasicCharacter("Tim");
        tim = new Sword(tim);
    }

    @org.junit.Test
    public void getName() {
        assertTrue(tim.getName().contains("The Sword Handler"));
    }

    @org.junit.Test
    public void getHealth() {
        assertEquals(tim.getHealth(),10);
    }
}