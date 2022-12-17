package abstractClasses;

public class animalDriver {
    public static void main(String [] args){
        Donkey myDonkey = new Donkey("Phil ");
        dragon myDragon = new dragon("Jake ");

        System.out.print(myDonkey);
        myDonkey.makeSound();

        System.out.print(myDragon);
        myDragon.makeSound();

    }
}
