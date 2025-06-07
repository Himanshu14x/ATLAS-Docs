package PracticeSet.atlaslearnings;

public class Task025 {

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

        System.out.println("**********");
        add(500,500f);
        add(435f, 100);
        add('H','R');
    }
}
