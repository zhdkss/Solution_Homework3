public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark, eerie entrance"))
                .addNPC(new NPC("Goblin", "A sneaky goblin lurking in the shadows"))
                .build();

        dungeon.describe();
    }
}