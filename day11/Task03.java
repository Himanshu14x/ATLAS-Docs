package PracticeSet.atlaslearnings.day11;

import java.io.*;
import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        FileOutputStream outfile = null;

        // To input string from console
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        byte[] b1 = s.getBytes();

        try {
            outfile = new FileOutputStream("FileName02.txt");
            outfile.write(b1);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
