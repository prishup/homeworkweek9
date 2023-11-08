package polymorphism_Q7;

public class Bicycle extends Vehicle {//subclass of Vehicle

    public static void main(String[] args) {
        Bicycle obj = new Bicycle();
        obj.speedUp();
    }
    @Override
    public void speedUp() {
        int speed = 20;
        System.out.println("Increasing speed by " + speed + "mph per hour");
    }
}

