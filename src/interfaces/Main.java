package interfaces;

public class Main {
    public static void main(String[] args) {

        Cat newCat= new Cat();
        Dog newDog=new Dog();
        newCat.makeSound();
        newCat.move();
        newDog.makeSound();
        newDog.move();

    }
}