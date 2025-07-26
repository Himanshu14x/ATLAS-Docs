package PracticeSet.atlaslearnings.day21;

abstract class BirdsthatFly {
    abstract void fly() ;
}
abstract class BirdsthatDontFly {
    abstract void Speciality() ;
}
class Eagle extends BirdsthatFly {
    @Override
    public void fly() {
        System.out.println((" Eagles fly"));
    }
}
class Ostrich  extends BirdsthatDontFly {
    @Override
    public void Speciality() {
        System.out.println(("It lays big egg"));
    }
}
class Driverclass{
    public static void main(String[] args) {
        BirdsthatFly bird = new Eagle();
        bird.fly();

        BirdsthatDontFly bird1 = new Ostrich();
        bird1.Speciality();
    }

    }


