package PracticeSet.atlaslearnings.day10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter8 {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}

