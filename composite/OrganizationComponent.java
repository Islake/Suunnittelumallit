package composite;

import java.util.ArrayList;
import java.util.List;

abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract double getSalary();

    public abstract String toXml(int indentationLevel);

    protected String getIndentation(int level) {
        return " ".repeat(level * 2);
    }
    
}

