package polymorphism_Q6;

public class Bird extends Animal {//subclass

    public static void main(String[] args) {
        Bird obj = new Bird();
        obj.sound();

    }
    @Override
    public void sound() {
        System.out.println("A Bird sounds chi-chi");
    }
}
