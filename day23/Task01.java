package PracticeSet.atlaslearnings.day23;

abstract class Pizza {
    abstract void preparation();
    abstract void baking();
    abstract void cutting();
    abstract void boxing();
}


class PepperoniPizza extends Pizza {
    @Override
    void preparation() {
        System.out.println("Preparing Pepperoni Pizza with dough, cheese, and pepperoni.");
    }

    @Override
    void baking() {
        System.out.println("Baking Pepperoni Pizza at 400 degrees for 20 minutes.");
    }

    @Override
    void cutting() {
        System.out.println("Cutting Pepperoni Pizza into diagonal slices.");
    }

    @Override
    void boxing() {
        System.out.println("Boxing Pepperoni Pizza in official pizza box.");
    }
}


interface PizzaFactory {
    Pizza createPizza();
}


class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}


public class Task01 {
    public static void main(String[] args) {
        PizzaFactory pfobj = new PepperoniPizzaFactory();
        Pizza pobj = pfobj.createPizza();

        pobj.preparation();
        pobj.baking();
        pobj.cutting();
        pobj.boxing();
    }
}
