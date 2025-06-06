package PracticeSet.atlaslearnings;

class Person1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

public class Task018{
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Himanshu");
        System.out.println(myObj.getName());

    }
}

