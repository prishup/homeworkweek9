package inheritance_Q5;
/*
5. Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.
 */

public class Vehicle1 { //base class of truck and car1
    String fueltype;

    public static void main(String[] args) {
        Vehicle1 obj = new Vehicle1();
        obj.calculatingFueleffiency(80, 4);
        obj.distancetravelled(80);
        obj.maximunspeed(100);
        obj.features("B M W", "5 series", 2015, "petrol");

    }
    public void calculatingFueleffiency(double distance, double fuelused){
        double fuelefficiency = distance/fuelused;
        System.out.println("Fueleffieciency : " + fuelefficiency);
    }
    public void distancetravelled(double distance){
        System.out.println("Distance travelled :" + distance +"miles");
    }

    public void maximunspeed(double miles){
        System.out.println(("Maximum speed :" + miles +"miles/hour"));

    }
    public void features(String make, String model, double Year, String fueltype){
        System.out.println(make);
        System.out.println(model);
        System.out.println(Year);
        System.out.println((fueltype));
    }
}

