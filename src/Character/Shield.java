package Character;

/**
 * Character.Character with a defensive tool
 * @author Sean McGovern
 * @version 1.0
 */
public class Shield extends CharacterDecorator {
    public Shield(CharacterGeneric tempCharacterGeneric) {
        super(tempCharacterGeneric);
    }

    /**
     * Gets the name of the character
     * @return the name of the character
     */
    public String getName() {
        return tempCharacterGeneric.getName() + " The Shield Bearer";
    }

    /**
     * Gets the health of the character
     * @return the health of the character
     */
    public int getHealth() {
        return tempCharacterGeneric.getHealth() + 15;
    }
}

