package Character;

/**
 * Character.Character with a long pointy weapon
 * @author Sean McGovern
 * @version 1.0
 */
public class Spear extends CharacterDecorator {
    public Spear(CharacterGeneric tempCharacterGeneric) {
        super(tempCharacterGeneric);
    }

    /**
     * Gets the name of the character
     * @return the name of the character
     */
    public String getName() {
        return tempCharacterGeneric.getName() + " The Spear Thrower";
    }

    /**
     * Gets the health of the character
     * @return the health of the character
     */
    public int getHealth() {
        return tempCharacterGeneric.getHealth() + 5;
    }
}