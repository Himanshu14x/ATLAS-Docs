package PracticeSet.atlaslearnings.day10;

class Test extends Thread{
    public void run(){
        System.out.println("thread started.");
    }
}

public class Task13 {
    public static void main(String[] args){

        Test t1 = new Test();
        t1.run();
        t1.start();
        Thread t2 = new Thread("New thread");
        t2.start();
    }
}
