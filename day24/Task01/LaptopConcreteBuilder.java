package PracticeSet.atlaslearnings.day24;

public class LaptopConcreteBuilder implements LaptopBuilder {
    private Laptop laptop;

    public LaptopConcreteBuilder() {
        this.laptop = new Laptop();
    }

    @Override
    public LaptopBuilder buildMemory(int memory) {
        laptop.setMemory(memory);
        return this;
    }

    @Override
    public LaptopBuilder buildStorage(int storage) {
        laptop.setStorage(storage);
        return this;
    }

    @Override
    public Laptop build() {
        return laptop;
    }
}
