package PracticeSet.atlaslearnings.day21;
// composition
class Wheel {
    public Wheel() {
        System.out.println("Wheel created");
    }
}

class Car2 {
    private Wheel[] wheels;

    public Car2() {

        wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public void show() {
        System.out.println("Car with " + wheels.length + " wheels is ready.");
    }
}

public class Task11 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.show();
    }
}


