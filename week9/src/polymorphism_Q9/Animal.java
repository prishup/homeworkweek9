package polymorphism_Q9;
/*
Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.
 */
public class Animal { //Father class
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.move();
        obj.sound();

    }
    public void move(){
        System.out.println("Animal can move Easily");


    }
    public void sound(){
        System.out.println("Every Animal can sound differently");

    }
}
