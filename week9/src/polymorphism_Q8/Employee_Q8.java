package polymorphism_Q8;
/*
8. Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
override the calculateSalary() method to calculate and return the salary based on their
specific roles.
 */
public class Employee_Q8 {
    public static void main(String[] args) {
        Employee_Q8 obj = new Employee_Q8();
        obj.calcualteSalary(25000);

    }
    public void calcualteSalary(int salary){
        System.out.println("salary of employee");
        System.out.println(salary);

        }
    }

