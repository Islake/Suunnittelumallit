package abstract_factory;

public class Game {
    public static void main(String[] args) {
        UIFactory factoryA = new AFactory();
        UIFactory factoryB = new BFactory();

        // Creating elements using Factory A
        Button buttonA = factoryA.createButton("Play");
        TextField textFieldA = factoryA.createTextField("Username");
        Checkbox checkboxA = factoryA.createCheckbox("Remember me");

        System.out.println("UI Elements in Style A:");
        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        buttonA.setText("Start");
        buttonA.display();

        // Creating elements using Factory B
        Button buttonB = factoryB.createButton("Continue");
        TextField textFieldB = factoryB.createTextField("Username");
        Checkbox checkboxB = factoryB.createCheckbox("Accept terms");

        System.out.println("\nUI Elements in Style B:");
        buttonB.display();
        textFieldB.display();
        checkboxB.display();

        textFieldB.setText("Saves");
        textFieldB.display();
    }
}
