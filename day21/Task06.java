package PracticeSet.atlaslearnings.day21;

class Student {
    public int roll_no = 10;
    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }
    public void setRoll(int roll) {
        if(!(roll > 100))
            roll_no = roll;
    }
}
class Tight_Coupling01 {
    public static void main(String[] args) {
        Student sobj = new Student();
        sobj.roll_no = 10;
        sobj.getRoll();
        sobj.setRoll(13);
        sobj.getRoll();

        System.out.println("the roll no of student is "+ sobj.roll_no);
    }
}
