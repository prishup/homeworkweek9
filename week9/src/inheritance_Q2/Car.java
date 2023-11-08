package inheritance_Q2;

//child class of vehicle
public class Car extends Vehicle {  //child class
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }

    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
