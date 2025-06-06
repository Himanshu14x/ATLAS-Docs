package PracticeSet.atlaslearnings;

 class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

public class Task017{
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Himanshu");
        System.out.println(myObj.getName());

    }
}

