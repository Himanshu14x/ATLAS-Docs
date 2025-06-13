package PracticeSet.atlaslearnings.day09;

import java.time.LocalDate;
class OuterClass4 {
    int x = 10;
    static class InnerClass {
        static int y = 5;
    }
    int a = InnerClass.y+x;
}
public class Task15 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        OuterClass4.InnerClass myInner = new OuterClass4.InnerClass();
        System.out.println(myInner.y);
        OuterClass4.InnerClass.y = 15;
        System.out.println(OuterClass4.InnerClass.y);
    }
}

