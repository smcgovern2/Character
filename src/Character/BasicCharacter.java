package Character;

/**
 * Undecorated Character
 * @author Sean McGovern
 * @version 1.0
 */
public class BasicCharacter implements CharacterGeneric {
    String name;
    int health;
    public BasicCharacter(String name) {
        this.name = name;
        this.health = 0;
    }

    /**
     * Get the name of the character
     * @return name of the character
     */
    public String getName() {
        return name;
    }

    /**
     * Get the health of the character
     * @return the health of the character
     */
    public int getHealth() {
        return health;
    }
}
