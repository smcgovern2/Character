package Character;

/**
 * Character.Character with an intense hunger
 * @author Sean McGovern
 * @version 1.0
 */
public class Starving extends CharacterDecorator {
    public Starving(CharacterGeneric tempCharacterGeneric) {
        super(tempCharacterGeneric);
    }

    /**
     * Gets the name of the character
     * @return the name of the character
     */
    public String getName() {
        return tempCharacterGeneric.getName() + " The Hungry";
    }


    /**
     * Gets the health of the character
     * @return the health of the character
     */
    public int getHealth() {
        return tempCharacterGeneric.getHealth() - 9;
    }
}

