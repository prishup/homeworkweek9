package encapsulation_Q14;
/*
14. Write a Java program to create a class called Car with private instance variables
company_name, model_name, year, and mileage. Provide public getter and setter
methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.
 */

public class Car1 extends Car {
    public static void main(String[] args) {
        Car1 t = new Car1();

        t.setCompany_name("B M W");
        t.setModel_name("5 series");
        t.setYear(2015);

        System.out.println( "Company Name- " +t.getCompany_name());
        System.out.println("Model Name - " +t.getModel_name());
        System.out.println("Year of Model - "+t.getYear());
        System.out.println("Mileage - "+t.getMileage());
    }
}
