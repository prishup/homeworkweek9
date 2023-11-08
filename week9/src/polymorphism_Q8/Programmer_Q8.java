package polymorphism_Q8;
/*
8. Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
override the calculateSalary() method to calculate and return the salary based on their
specific roles.
 */



public class Programmer_Q8 extends Employee_Q8 {
    public static void main(String[] args) {
        Programmer_Q8 obj = new Programmer_Q8();
       obj.calcualteSalary(50000);
    }
    @Override
    public void calcualteSalary( int salary) {
        if(salary<40000){
            System.out.println("Salary of Manager");
        }
        else{
            System.out.println("Salary of Programmer");
        }

    }
}
