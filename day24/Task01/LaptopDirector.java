package PracticeSet.atlaslearnings.day24.Task01;

public class LaptopDirector {
    private LaptopBuilder laptopBuilder;

    public LaptopDirector(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop constructLaptop() {
        return laptopBuilder
                .buildMemory(16)
                .buildStorage(512)
                .build();
    }
}
