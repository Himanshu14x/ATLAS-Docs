package PracticeSet.atlaslearnings.day12;

public class Task08 {

static String reverse(String s){
    char[] input = s.toCharArray();
    String Ans ="";
    for (int i = input.length-1; i >=0 ; i--) {
        Ans +=input[i];
    }

return Ans;
}

    public static void main(String[] args) {
        String s = "Himanshu";
        System.out.println(reverse(s));

    }
}
