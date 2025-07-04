package PracticeSet.atlaslearnings.day14;


public class Task11 {
    static int sumSquares(int m, int n) {
        int middle;
        if (m == n) {
            return m * m;
        } else {
            middle = (m + n) / 2;
            return sumSquares(m, middle) + sumSquares(middle + 1, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumSquares(1,10));
    }
}
