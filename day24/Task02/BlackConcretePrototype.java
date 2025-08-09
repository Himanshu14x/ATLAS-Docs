package PracticeSet.atlaslearnings.day24.Task02;


public class BlackConcretePrototype implements Colors{
    private String name;


    public BlackConcretePrototype() {
        System.out.println(" BlackConcreteprototype constructor is called");
    }
    public BlackConcretePrototype(String name) {
        this.name = name;
    }
    public Colors clone() {
        return new BlackConcretePrototype(this.name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

