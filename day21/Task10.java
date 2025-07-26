package PracticeSet.atlaslearnings.day21;
// aggregation
class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car1 {
    private Driver driver;

    public Car1(Driver driver) {
        this.driver = driver;
    }

    public void showDriver() {
        if (driver != null) {
            System.out.println("Car is driven by: " + driver.getName());
        } else {
            System.out.println("No driver assigned.");
        }
    }
}

public class Task10 {
    public static void main(String[] args) {
        Driver driver = new Driver("John");
        Car1 myCar = new Car1(driver);

        myCar.showDriver();
    }
}
