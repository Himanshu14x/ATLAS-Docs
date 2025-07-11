package PracticeSet.atlaslearnings.day16;

public class Task11 {

    static int calc(int n) {
        if (n == 0) return 0;
        return n + calc(n-1);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(calc(n));
        int ans = (n*(n+1))/2;
        System.out.println(ans);
    }

}
