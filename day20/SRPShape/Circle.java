package PracticeSet.atlaslearnings.day20.SRPShape;

class Circle implements Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}


class AreaComparator {
    public double compareArea(Shape a, Shape b) {
        return a.area() - b.area();
    }
}
