package state;

public class ExpertState implements CharacterState {
    @Override
    public void train(GameCharacter character) {
        character.increaseExperience(30);
        System.out.println(character.getName() + " trained and gained 30 experience points.");
        if (character.getExperience() >= 300) {
            character.setState(new MasterState());
            System.out.println(character.getName() + " has advanced to Master level!");
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        character.increaseHealth(20);
        System.out.println(character.getName() + " meditated and gained 20 health points.");
    }

    @Override
    public void fight(GameCharacter character) {
        character.decreaseHealth(15);
        character.increaseExperience(40);
        System.out.println(character.getName() + " fought and lost 15 health points but gained 40 experience points.");
        if (character.getExperience() >= 300) {
            character.setState(new MasterState());
            System.out.println(character.getName() + " has advanced to Master level!");
        }
    }
}