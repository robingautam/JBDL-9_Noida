package Encapsulation;

public class EncMain {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setAge(-2);
        employee.calculateAge("12/05/2001");

        System.out.println(employee.getAge());
    }
}
