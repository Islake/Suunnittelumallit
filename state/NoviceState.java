package state;

public class NoviceState implements CharacterState {
    @Override
    public void train(GameCharacter character) {
        character.increaseExperience(10);
        System.out.println(character.getName() + " trained and gained 10 experience points.");
        if (character.getExperience() >= 50) {
            character.setState(new IntermediateState());
            System.out.println(character.getName() + " has advanced to Intermediate level!");
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " cannot meditate at Novice level.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println(character.getName() + " cannot fight at Novice level.");
    }
}