package Character;

/**
 * An object to affix to the character
 * @author Sean McGovern
 * @version 1.0
 */

abstract class CharacterDecorator implements CharacterGeneric {
    protected CharacterGeneric tempCharacterGeneric;
    public CharacterDecorator(CharacterGeneric tempCharacterGeneric) {
        this.tempCharacterGeneric = tempCharacterGeneric;
    }

    /**
     * Gets the name of the character
     * @return the name of the character
     */
    public String getName() {
        return tempCharacterGeneric.getName();
    }

    /**
     * Gets the health of the character
     * @return the health of the character
     */
    public int getHealth() {
        return tempCharacterGeneric.getHealth();
    }
}