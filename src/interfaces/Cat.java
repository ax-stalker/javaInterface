package interfaces;
public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void move() {
    System.out.println("cat walk");
    }
}
