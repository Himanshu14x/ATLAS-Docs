package PracticeSet.atlaslearnings.day10;

class Counter {
    private int count = 0;

    public  void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo1 extends Thread {
    Counter counter;

    ThreadDemo1(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i<100000; i++) {
            counter.increment();

        }
    }
}

public class Task05 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadDemo1 t1 = new ThreadDemo1(counter);
        ThreadDemo1 t2 = new ThreadDemo1(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}