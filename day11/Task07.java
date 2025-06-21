package PracticeSet.atlaslearnings.day11;

import java.io.*;
public class Task07 {
    public static void main(String[] args) {
        try
        {
            FileInputStream file1 = new FileInputStream("FileName01.txt");
            FileInputStream file2 = new FileInputStream("FileName02.txt");
            SequenceInputStream file3 = new SequenceInputStream(file1, file2);
            FileWriter newFile = new FileWriter("FileName05.txt", true);
            BufferedInputStream br1 = new BufferedInputStream(file3);
            BufferedOutputStream br2 = new BufferedOutputStream(System.out);


            int ch;
            while((ch = br1.read())!=-1)
            {
                br2.write((char)ch);
                newFile.write((char)ch);
            }
            br1.close();
            br2.close();
            file1.close();
            file2.close();
            newFile.close();
            System.out.println("Merge Two File Sucessfully ");
        }
        catch(IOException e)
        {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
    }
}
