package encapsulation_Q13;

public class Employee1 extends Employee {//test class for Employee

    public static void main(String[] args) {
        Employee1 t = new Employee1();
        t.setEmployee_id(05);
        t.setName("Shikha");
        System.out.println("Employee ID : " +t.getEmployee_id());
        System.out.println("Employee Name : " + t.getName());
        System.out.println(t.getFormattedSalary(20000));
    }

}
