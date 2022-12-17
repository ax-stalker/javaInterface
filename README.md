# javaInterface


This project has two packages: <b>interfaces</b> and, <b> abstractClasses</b>.

# Interfaces
## Animal interface

It is an interface with two abstract methods.
An abstract method is a method header without a method body/ implementation.
An interface is used to establish a set of methods that a class will implement.
An interface cannot be instantiated.
An interface can be implmented by a class via:
<ul>

<li> Stating so in the class header.</li>
<li> Providing implementations for each abstract method.</li>

          package interfaces;
        public interface Animal {
          public void makeSound();
          public void move();
        }

## Implementing the Animal interface.

### For a cat class:

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

### For a dog class:

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
             
             
 ### The main class
 
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
