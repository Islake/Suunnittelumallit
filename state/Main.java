package state;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter("Erkki");
        Scanner scanner = new Scanner(System.in);

        while (!(character.getState() instanceof MasterState)) {
            character.displayStatus();
            System.out.println("Choose an action: train, meditate, fight, stop");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "train":
                    character.train();
                    break;
                case "meditate":
                    character.meditate();
                    break;
                case "fight":
                    character.fight();
                    break;
                case "stop":
                    System.out.println("Stopping the game.");
                    return; // Exit the main method to stop the program
                default:
                    System.out.println("Invalid action. Please choose again.");
            }
        }

        System.out.println(character.getName() + " has reached the Master level. Game over!");
        scanner.close();
    }
}