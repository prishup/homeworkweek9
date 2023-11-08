package inheritance_Q5;

public class Motorcycle extends Vehicle1 {//subclass of vehicle1

    public static void main(String[] args) {
        Motorcycle obj = new Motorcycle();

        obj.calculatingFueleffiency(60, 7);
        obj.distancetravelled(140);
        obj.maximunspeed(80);
        obj.features("Honda", "Civic", 2014, "petrol");
    }

}
