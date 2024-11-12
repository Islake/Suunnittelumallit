package builder;

public class Main {
    public static void main(String[] args) {
        // Build a gaming computer
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gamingBuilder);
        director.constructComputer();
        Computer gamingComputer = director.getComputer();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Build an office computer
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director = new ComputerDirector(officeBuilder);
        director.constructComputer();
        Computer officeComputer = director.getComputer();
        System.out.println("Office Computer: " + officeComputer);
    }
}