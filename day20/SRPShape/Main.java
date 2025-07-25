package PracticeSet.atlaslearnings.day20.SRPShape;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape circle = new Circle(4);

        AreaComparator comparator = new AreaComparator();
        double result = comparator.compareArea(square, circle);

        if (result > 0) {
            System.out.println("Square has a larger area.");
        } else if (result < 0) {
            System.out.println("Circle has a larger area.");
        } else {
            System.out.println("Both have equal area.");
        }
    }
}
