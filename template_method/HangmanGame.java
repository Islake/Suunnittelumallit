package template_method;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HangmanGame extends Game {
    private String wordToGuess;
    private StringBuilder currentGuess;
    private Set<Character> guessedLetters;
    private int remainingAttempts;
    private boolean gameWon;

    @Override
    public void initializeGame(int numberOfPlayers) {
        wordToGuess = "example";
        currentGuess = new StringBuilder("_".repeat(wordToGuess.length()));
        guessedLetters = new HashSet<>();
        remainingAttempts = 6; // Wrong guesses allowed
        gameWon = false;
    }

    @Override
    public boolean endOfGame() {
        return gameWon || remainingAttempts <= 0;
    }

    @Override
    public void playSingleTurn(int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current guess: " + currentGuess);
        System.out.println("Remaining attempts: " + remainingAttempts);
        System.out.print("Player " + (player + 1) + ", enter a letter: ");
        char guess = scanner.next().charAt(0);

        if (guessedLetters.contains(guess)) {
            System.out.println("You already guessed that letter.");
            return;
        }

        guessedLetters.add(guess);

        if (wordToGuess.indexOf(guess) >= 0) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    currentGuess.setCharAt(i, guess);
                }
            }
            if (currentGuess.toString().equals(wordToGuess)) {
                gameWon = true;
            }
        } else {
            remainingAttempts--;
        }
    }

    @Override
    public void displayWinner() {
        if (gameWon) {
            System.out.println("Congratulations! You've guessed the word: " + wordToGuess);
        } else {
            System.out.println("Game over! The word was: " + wordToGuess);
        }
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.play(1); // Single player game
    }
}