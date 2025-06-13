package PracticeSet.atlaslearnings.day09;

public class ExceptionHandling05 {
    public static void main(String[] args) {
        int a[] = new int[2];
        try {

            int b = 10;
            int c = 1/b;
            System.out.println("Access element three :" + a[1]);



            System.out.println("Out of the block");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array of 1st Index  :" + a[1]);
        }catch (Exception e) {
            System.out.println("Exception thrown  :" + e.getMessage());
        } finally{
            System.out.println("We reached finally block");
        }
        System.out.println("Out of the block");
    }

}

