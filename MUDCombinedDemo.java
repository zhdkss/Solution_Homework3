public class MUDCombinedDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Ruins")
                .addRoom(new Room("Main Hall", "A grand, crumbling hall"))
                .addNPC(new NPC("Guardian", "An ancient guardian protecting the ruins"))
                .build();
        System.out.println("Original Dungeon:");
        dungeon.describe();
        Room prototypeRoom = new Room("Side Chamber", "A small room with mysterious engravings");
        Room clonedRoom1 = prototypeRoom.cloneEntity();
        Room clonedRoom2 = prototypeRoom.cloneEntity();
        dungeon.addRoom(clonedRoom1);
        dungeon.addRoom(clonedRoom2);
        System.out.println("\nDungeon after adding cloned rooms:");
        dungeon.describe();
    }
}
