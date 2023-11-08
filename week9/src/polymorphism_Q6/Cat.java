package polymorphism_Q6;

public class Cat extends Animal { //subclass of Animal
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }

    @Override
    public void sound() { //overide from animal class
        System.out.println("A cat sounds meao meao");
    }
}
