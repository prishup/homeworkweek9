package inheritance_Q2;
/*
Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a
car".
 */

//father class of car
public class Vehicle {    //parent class
     public void drive(){
         System.out.println("I have Mercidies silver car");
     }
     public static void main(String[] args) {
        Vehicle t = new Vehicle();
        t.drive();
    }
}
