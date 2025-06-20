package PracticeSet.atlaslearnings.day10;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    RunnableDemo( String name){  //constructor with 1 parameter
        threadName = name;
        System.out.println("Creating " + threadName );
    }


    public void run() {
        System.out.println("Running " + threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
// Let the thread sleep for a while.
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }


    public void start () {
        System.out.println("Starting " + threadName );
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
    }


public class Task03 {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.start();
        RunnableDemo R3 = new RunnableDemo( "Thread-3");
        R3.start();
        RunnableDemo R4 = new RunnableDemo( "Thread-4");
        R4.start();

        Thread t = new Thread(new RunnableDemo("Thread-5"));
        t.start();
    }
}
