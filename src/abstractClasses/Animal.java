package abstractClasses;

public abstract class Animal {
    public String name;
    public abstract void makeSound();
    public abstract void move();
    public Animal(String animalName){
        name=animalName;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return getName();
    }
}
