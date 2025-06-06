package PracticeSet.atlaslearnings;

public class Task014 {

    public static void main(String[] args) {
        char[] arr = {'a','e','i','o','u'};
        System.out.println(arr);
        String[] names = {"Meena", "Tina", "Veena", "heena"};
        System.out.println(names[0]);
        names[1]= "Reena";
        System.out.println(names[1]);
        System.out.println(names.length);
        System.out.println(names[4]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        System.out.println(arr[5]);

    }

}

