package week3.assignment3;

public class que3 {
    static class Employee {
        String empName;
        double salary;
        boolean permanent;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Name: " + emp.empName);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Permanent: " + emp.permanent);
    }
}
