package inheritance_Q5;

public class Car1 extends Vehicle1 {//subclass of vehicle 1

    public static void main(String[] args) {
        Car1 obj = new Car1();
        obj.calculatingFueleffiency(80 , 6);
        obj.distancetravelled(100);
        obj.maximunspeed(70);
        obj.features("Toyota", "Auris", 2013, "Hybrid");
    }
}
