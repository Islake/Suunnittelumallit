package composite;

class Employee extends OrganizationComponent {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toXml(int indentationLevel) {
        String indent = getIndentation(indentationLevel);
        return indent + "<Employee name=\"" + name + "\" salary=\"" + salary + "\" />\n";
    }
}
