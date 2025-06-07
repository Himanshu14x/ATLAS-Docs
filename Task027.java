package PracticeSet.atlaslearnings;

class Employee{
    private int pwd = 1254;
    protected int Salary = 50000;
    public int empId = 10001;
static void employee(){
}
    public int getPwd() {
        return pwd;
    }
    public int getSalary() {
        return Salary;
    }
    public int getEmpId(){
    return empId;
    }
}
class Hr extends Employee {
    void changeSalary(){
        super.Salary = 100000;
    }
    void changeEmpID(){
        super.empId = 100;
    }
}
public class Task027{
    public static void main(String[] args) {
      Hr hr = new Hr();
        System.out.println(hr.getSalary());
        System.out.println(hr.empId);
        System.out.println(hr.getPwd());
        System.out.println(hr.getEmpId());
        System.out.println("***************");
        hr.changeSalary();
        hr.changeEmpID();
        System.out.println(hr.getSalary());
        System.out.println(hr.Salary);

        System.out.println(hr.getEmpId());
        System.out.println(hr.empId);

        System.out.println("**********");
        System.out.println(hr.getPwd());


    }

}


