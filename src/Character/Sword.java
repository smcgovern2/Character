package Character;

/**
 * Character.Character with a knife but bigger
 * @author Sean McGovern
 * @version 1.0
 */
public class Sword extends CharacterDecorator {
    public Sword(CharacterGeneric tempCharacterGeneric) {
        super(tempCharacterGeneric);
    }
    /**
     * Gets the name of the character
     * @return the name of the character
     */
    public String getName() {
        return tempCharacterGeneric.getName() + " The Sword Handler";
    }

    /**
     * Gets the health of the character
     * @return the health of the character
     */
    public int getHealth() {
        return tempCharacterGeneric.getHealth() + 10;
    }
}