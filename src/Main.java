public class Main {
    public static void main(String[] args) {
        Character basicCharacter = new Starving(new Shield(new Spear(new Sword(new BasicCharacter("Bilbo")))));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Heath: " + basicCharacter.getHealth());
    }
}