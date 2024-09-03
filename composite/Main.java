package composite;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Person 1", 50000);
        Employee emp2 = new Employee("Person 2", 60000);
        Employee emp3 = new Employee("Person 3", 70000);
        Employee emp4 = new Employee("Person 4", 55000);

        Department hrDepartment = new Department("HR");
        Department itDepartment = new Department("IT");
        Department salesDepartment = new Department("Sales");

        hrDepartment.add(emp1);
        hrDepartment.add(emp2);

        itDepartment.add(emp3);

        salesDepartment.add(emp4);

        Department headDepartment = new Department("Headquarters");
        headDepartment.add(hrDepartment);
        headDepartment.add(itDepartment);
        headDepartment.add(salesDepartment);

        System.out.println("Total Salary of Organization: " + headDepartment.getSalary());

        System.out.println("\nOrganizational Structure in XML:");
        System.out.println(headDepartment.toXml(0));
    }
}
