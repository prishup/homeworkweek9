package polymorphism_Q7;
/*
Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.
 */

public class Vehicle {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.speedUp();

    }
    public void speedUp(){
        System.out.println("Vehicle speed is increasing");

    }
}
