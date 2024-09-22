package state;

public class IntermediateState implements CharacterState {
    @Override
    public void train(GameCharacter character) {
        character.increaseExperience(20);
        System.out.println(character.getName() + " trained and gained 20 experience points.");
        if (character.getExperience() >= 150) {
            character.setState(new ExpertState());
            System.out.println(character.getName() + " has advanced to Expert level!");
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        character.increaseHealth(10);
        System.out.println(character.getName() + " meditated and gained 10 health points.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println(character.getName() + " cannot fight at Intermediate level.");
    }
}