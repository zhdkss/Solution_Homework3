README

Overview
This project demonstrates the **Builder** and **Prototype** design patterns in Java by implementing a Dungeon-building system. The **Builder Pattern** is used to construct complex Dungeon objects step by step, while the **Prototype Pattern** allows efficient cloning of Room and NPC objects.

Files & Structure
IDungeonBuilder.java – Interface for the Dungeon builder.
SimpleDungeonBuilder.java – Implements the Builder pattern to create a Dungeon.
Dungeon.java – Represents the Dungeon with Rooms and NPCs.
Room.java – Implements the Prototype pattern for cloning rooms.
NPC.java – Implements the Prototype pattern for cloning NPCs.
CloneableGameEntity.java – Interface for cloneable entities.
MUDBuilderDemo.java – Demonstrates the Builder pattern.
MUDPrototypeDemo.java – Demonstrates the Prototype pattern.
MUDCombinedDemo.java – Demonstrates both Builder and Prototype patterns together.

Expected Output
The Builder demo constructs a Dungeon and prints its details.
The Prototype demo clones a Room object and prints the original and cloned rooms.
The Combined demo builds a Dungeon and adds cloned rooms dynamically.

