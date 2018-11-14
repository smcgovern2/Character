package Character.Test;

import org.junit.Before;
import static org.junit.Assert.*;
import Character.*;
public class BasicCharacterTest {

    CharacterGeneric tim = new BasicCharacter("");
    @Before
    public void setUp(){
        tim = new BasicCharacter("Tim");
    }

    @org.junit.Test
    public void getName() {
        assertEquals(tim.getName(),"Tim");
    }

    @org.junit.Test
    public void getHealth() {
        assertEquals(tim.getHealth(),0);
    }
}