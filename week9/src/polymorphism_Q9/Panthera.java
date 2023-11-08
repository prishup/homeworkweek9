package polymorphism_Q9;
/*
Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.
 */
public class Panthera extends Animal {
    public static void main(String[] args) {
        Panthera obj = new Panthera();
        obj.move();
        obj.sound();
    }
    @Override
    public void move() {
        System.out.println("A cat moves slow");
        System.out.println("A leopard runs fast");
        System.out.println("A lion runs fast");
        System.out.println("--------------------");
    }
    @Override
    public void sound() {
        System.out.println("A cat sounds meow");
        System.out.println("A leopard sounds growl");
        System.out.println("A lion sounds roar roar");
    }
}

