package encapsulation_Q13;
/*
13. Write a Java program to create a class called Employee with private instance variables
employee_id, employee_name, and employee_salary. Provide public getter and setter
methods to access and modify the id and name variables, but provide a getter method
for the salary variable that returns a formatted string.
 */

public class Employee { //Encapsualtion class
    private int employee_id;
    private String name;
    private int employee_salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getFormattedSalary(int employee_salary){
        return String.format("Employee Salary: £%d",employee_salary);
    }


}
