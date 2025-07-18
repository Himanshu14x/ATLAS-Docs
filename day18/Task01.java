package PracticeSet.atlaslearnings.day18;
import java.util.*;

class Task01 {

    LinkedList<Entry>[] data = new LinkedList[10];

    public void put(String keyval, int value) {
        int index = Math.abs(keyval.hashCode() % data.length);

        if (data[index] == null) {
            data[index] = new LinkedList<>();
        }
        for (Entry e : data[index]) {
            if (e.keyval.equals(keyval)) {
                e.value = value;
                return;
            }
        }

        data[index].add(new Entry(keyval, value));
    }

    static class Entry {
        String keyval;
        int value;

        Entry(String k, int v) {
            keyval = k;
            value = v;
        }
    }
}
