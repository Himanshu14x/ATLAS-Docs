package PracticeSet.atlaslearnings.day09;

    class OuterClass {
        int x = 10;
        class InnerClass {
            int y = 5;
        }
    }
    public class Task11 {
        public static void main(String[] args) {
            OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y + myOuter.x);
        }
    }

