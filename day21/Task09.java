package PracticeSet.atlaslearnings.day21;
// 1. dependency
class Engine {
    void start() {
        System.out.println("Engine starting");
    }
}

class Car {
    void drive() {
        Engine engine = new Engine();
        engine.start();
        System.out.println("Car is driving");
    }
}

public class Task09 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}
