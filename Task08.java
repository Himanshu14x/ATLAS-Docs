package PracticeSet.atlaslearnings;

class customer{
    String name;

    public customer(String name){
        this.name = name;
    }

    void displayName(){
        System.out.println(name);
    }
}
public class Task08 {
    public static void main(String[] args) {
        customer atlas = new customer("Himanshu");
        System.out.println(atlas.name);
        atlas.displayName();
    }

}
