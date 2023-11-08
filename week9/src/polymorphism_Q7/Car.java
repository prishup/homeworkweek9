package polymorphism_Q7;

/*
Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.
 */


public class Car extends Vehicle { // subclass of Vehicle

    public static void main(String[] args) {
      Car obj = new Car();
      obj.speedUp();

    }
    @Override
    public void speedUp() {
        System.out.println("Speed is increasing by 40");
    }
}

