package PracticeSet.atlaslearnings.day24.Task01;

public class Laptop {
    private int memory;
    private int storage;

    public Laptop() {
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "memory=" + memory + " GB" +
                ", storage=" + storage + " GB" +
                '}';
    }
}
