package inheritance_Q5;
/*
5. Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.
 */
public class  Truck extends Vehicle1 {//subclass of vehicle1

    public static void main(String[] args) {
        Truck obj = new Truck();

        obj.calculatingFueleffiency(80, 8);
        obj.distancetravelled ( 120);
        obj.features("renault","acros", 2015,"petrol");
    }

}
