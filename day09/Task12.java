package PracticeSet.atlaslearnings.day09;

class OuterClass1 {
    int x = 10;
    static class InnerClass1 {
        int y = 5;
    }
}
public class Task12 {
    public static void main(String[] args) {
        OuterClass1 myOuter = new OuterClass1();
          OuterClass1.InnerClass1 in = new OuterClass1.InnerClass1();
        System.out.println(in.y + myOuter.x);
    }
}