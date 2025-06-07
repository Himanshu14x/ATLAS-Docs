package PracticeSet.atlaslearnings;

abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}
// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
class ACRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

class FanRemote extends Gadgets{


    @Override
    void turnOn() {
        System.out.println("Fan Remote is turned On");
    }

    @Override
    void turnOff() {
        System.out.println("Fan remote is turned off");
    }
}

class CoolerRemote extends Gadgets{


    @Override
    void turnOn() {
        System.out.println("Cooler Remote is turned on");
    }

    @Override
    void turnOff() {
        System.out.println("Cooler Remote is turned off");
    }
}

// Main class to demonstrate abstraction
public class Task029 {
    public static void main(String[] args) {
        Gadgets remote1 = new TVRemote();
        Gadgets remote2 = new ACRemote();
        remote1.turnOn();
        remote1.turnOff();
        remote2.turnOn();
        remote2.turnOff();

        Gadgets remote3 = new FanRemote();
        Gadgets remote4 = new CoolerRemote();
        remote3.turnOn();
        remote4.turnOff();
    }
}

