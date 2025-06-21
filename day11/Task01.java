package PracticeSet.atlaslearnings.day11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task01
{
    public static void main(String[] args)
    {
        File f1 = new File("FileName01.txt");
        byte[] Text = {'I',' ','L','O','V','E',' ','I','N','D','I','A'};
        try
        {
            FileOutputStream outfile = new FileOutputStream(f1);
            outfile.write(Text);
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
