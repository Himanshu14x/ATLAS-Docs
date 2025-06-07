package PracticeSet.atlaslearnings;

class Superclass{
    Superclass(){
        System.out.println("super class constructor called");
    }
    void superMethod(){
        System.out.println("superMethod called");
    }
}

public class Task023A{
    public static void main(String[] args){
        System.out.println("Driver class called");
        Superclass sobj = new Superclass();
        sobj.superMethod();
        System.out.println("Driver class ended");
    }
}

