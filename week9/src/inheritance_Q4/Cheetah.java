package inheritance_Q4;

public class Cheetah extends Animal { //subclass of Animal
    public static void main(String[] args) {
        Cheetah obj = new Cheetah(); //create object for calling
        obj.move();
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}

