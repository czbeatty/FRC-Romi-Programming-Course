import java.util.ArrayList;

public class SpriteGame {
    public static void main(String... args) {
        Player player = new Player("Adventurer");
        Enemy goblin = new Enemy("Goblin");
        Enemy orc = new Enemy("Orc");
        NPC shopkeeper = new NPC("Shopkeeper");
        DestructibleObject suspiciousRock = new DestructibleObject();

        ArrayList<Character> characters = new ArrayList<Character>();
        ArrayList<Fightable> fighters = new ArrayList<Fightable>();

        characters.add(player);
        characters.add(goblin);
        characters.add(orc);
        characters.add(shopkeeper);

        fighters.add(player);
        fighters.add(goblin);
        fighters.add(orc);
        fighters.add(suspiciousRock);

        outputCharacterNames(characters);
        introduceCharacters(characters);
        fightFightables(fighters);
    }

    public static void outputCharacterNames(ArrayList<Character> characters) {
        for (int i = 0; i < characters.size(); i++) {
            characters.get(i).printName();
        }
    }

    public static void fightFightables(ArrayList<Fightable> fighters) {
        for (int i = 0; i < fighters.size(); i++) {
            fighters.get(i).attack();
        }
    }

    public static void introduceCharacters(ArrayList<Character> characters) {
        for (int i = 0; i < characters.size(); i++) {
            characters.get(i).introduce();
        }
    }
}
