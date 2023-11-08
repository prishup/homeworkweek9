package polymorphism_Q6;

public class Animal {//base class

    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.sound();
    }

    public void sound(){
        System.out.println("Animal can sound differently");
    }
}

