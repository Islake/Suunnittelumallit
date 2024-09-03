package composite;

import java.util.ArrayList;
import java.util.List;

class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (OrganizationComponent component : components) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }

    @Override
    public String toXml(int indentationLevel) {
        StringBuilder xml = new StringBuilder();
        String indent = getIndentation(indentationLevel);

        xml.append(indent).append("<Department name=\"").append(name).append("\">\n");

        for (OrganizationComponent component : components) {
            xml.append(component.toXml(indentationLevel + 1));
        }

        xml.append(indent).append("</Department>\n");
        return xml.toString();
    }
}
