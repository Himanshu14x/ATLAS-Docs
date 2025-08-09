package PracticeSet.atlaslearnings.day24.Task02;

public class WhiteConcretePrototype implements Colors {
    private String name;


    public WhiteConcretePrototype() {
        System.out.println(" WhiteConcretePrototype constructor is called");
    }

    public WhiteConcretePrototype(String name) {
        this.name = name;
    }

    public Colors clone() {
        return new WhiteConcretePrototype(this.name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
