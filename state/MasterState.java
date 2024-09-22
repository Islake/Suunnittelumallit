package state;

public class MasterState implements CharacterState {
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " is at Master level and cannot train further.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " is at Master level and cannot meditate further.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println(character.getName() + " is at Master level and cannot fight further.");
    }
}