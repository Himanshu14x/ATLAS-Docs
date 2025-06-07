package PracticeSet.atlaslearnings;
public class Task024 {
    // task 024 - Number of Parameters
   static void add(int x, int y) {
        System.out.println(x+y);
    }
    static void add(int x, int y, int z) {
        System.out.println(x+y+z);
    }
    // Task 025 - Type of Parameters
    static void add(int x, float y){
        System.out.println(x+y);
    }
   static  void add(float x, int y){
       System.out.println(x+y);
    }
    static void add(char x, char y){
        System.out.println(x+"  "+y);
    }

    public static void main(String[] args) {
        add(10, 20, 30);
        add(50, 100);
        System.out.println("**********");
        add(500,500f);
        add(435f, 100);
        add('H','R');
    }
}


