package encapsulation_Q11;

public class Person1 extends Person { //test for Person class
    public static void main(String[] args) {
        Person1 t = new Person1();
        t.setName("Kinjal");
        t.setCountry("India");
        t.setAge(34);


        System.out.println("Name - " +t.getName());
        System.out.println("Country - " +t.getCountry());
        System.out.println("Age - " +t.getAge());

    }
}
