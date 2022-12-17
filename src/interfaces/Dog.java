package interfaces;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("woof");

    }

    @Override
    public void move() {
    System.out.println("run");
    }
}
