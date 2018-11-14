package Character;

/**
 * Runnable class for character
 * @author Sean McGovern
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        CharacterGeneric basicCharacterGeneric = new Starving(new Shield(new Spear(new Sword(new BasicCharacter("Bilbo")))));
        System.out.println("Name: " + basicCharacterGeneric.getName());
        System.out.println("Heath: " + basicCharacterGeneric.getHealth());
    }
}