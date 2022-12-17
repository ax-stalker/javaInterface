package abstractClasses;

public class Donkey extends Animal{
    public Donkey(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("brays");
    }

    @Override
    public void move() {
        System.out.println("gallop");
    }
}
