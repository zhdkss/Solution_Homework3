public class NPC implements CloneableGameEntity {
    private String name;
    private String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name, this.description);
    }

    @Override
    public String toString() {
        return "NPC{" + "name='" + name + '\'' + ", description='" + description + '\'' + '}';
    }
}
