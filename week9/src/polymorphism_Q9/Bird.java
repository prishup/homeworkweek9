package polymorphism_Q9;
/*
Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.
 */
public class Bird extends Animal{
    public static void main(String[] args) {
        Bird obj = new Bird();
        obj.move();
        obj.sound();

    }@Override
    public void sound() {
        System.out.println("-----------------------");
        System.out.println("Parrot sounds squawk squawk");
        System.out.println("Pigeon sounds coo coo");
        System.out.println("Pig sounds oink oink");


    }
    @Override
    public void move() {

        System.out.println("Parrot moves easily");
        System.out.println("Pigeon moves slowly ");
        System.out.println("Pig moves slowly as well");
    }
}
