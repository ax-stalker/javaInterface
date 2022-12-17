package abstractClasses;



public class dragon extends Animal {

    public dragon(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("roar");
    }

    @Override
    public void move() {
        System.out.println("fly");
    }
}
