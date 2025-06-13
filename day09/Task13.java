package PracticeSet.atlaslearnings.day09;
class OuterClass2 {
    int x = 10;
    static class InnerClass1 {
        int y = 5;
    }
}
public class Task13 {
    public static void main(String[] args) {
        OuterClass2 myOuter = new OuterClass2();
          OuterClass2.InnerClass1 in = new OuterClass2.InnerClass1();
        System.out.println(in.y + myOuter.x);
    }
}