package PracticeSet.atlaslearnings.day21;
import java.util.ArrayList;
import java.util.List;
class Animal {
    void sound() {
        System.out.println("Sounds of different animals");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow is the sound of cat");
    }
    void animalSound(List<? extends Animal> animalList) {
        for (Animal element : animalList) {
            element.sound();
        }
    }
}
public class Task04 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);

        Cat caller = new Cat();
        caller.animalSound(cats);
    }
}
