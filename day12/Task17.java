package PracticeSet.atlaslearnings.day12;
import java.util.HashMap;
class BadHash {
    int value;
    BadHash(int value) {
        this.value = value;
    }
    @Override
    public int hashCode() {
        return 42; // constant hash code to force collision
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof BadHash && ((BadHash) obj).value == this.value;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
public class Task17 {
    public static void main(String[] args) {
        HashMap<BadHash, Integer> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put(new BadHash(i), i);
        }
        System.out.println(map);
    }
}
