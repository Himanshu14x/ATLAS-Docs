package PracticeSet.atlaslearnings.day21;

interface ICalcShapesArea {
    void calcArea();
    void calcVolume();
}

class Circle implements ICalcShapesArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    @Override
    public void calcVolume() {
        System.out.println("Circle has no volume (2D shape).");
    }
}

class Sphere implements ICalcShapesArea {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calcArea() {
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.println("Sphere Surface Area: " + surfaceArea);
    }

    @Override
    public void calcVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Sphere Volume: " + volume);
    }
}

public class Task03 {
    public static void main(String[] args) {
        ICalcShapesArea circle = new Circle(5);
        circle.calcArea();
        circle.calcVolume();

        System.out.println("---------------------------");

        ICalcShapesArea sphere = new Sphere(5);
        sphere.calcArea();
        sphere.calcVolume();
    }
}
