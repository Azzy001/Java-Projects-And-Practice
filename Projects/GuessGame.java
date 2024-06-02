import java.util.Random;
import java.util.Scanner;

/**
 * Arsalan.
 * 02-06-2024
 */
public class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the guess game.");

        // generate random number from 0 to 10 (inclusive)
        int random_number = random.nextInt(10);

        // variable to control the game loop
        boolean isRunning = true;

        // number of tries the player has
        int tries = 4;

        while (isRunning) {
            // display random num on terminal for debugging purposes.
            // Remove/comment out wehen playing game.
            System.out.println("DEBUGGING: " + random_number);
            System.out.print("Guess the number (between 0 and 10): ");

            // player prompts a number
            int guess = scanner.nextInt();
            // consume new line
            scanner.nextLine();

            // condition to check if the guess is correct.
            if (guess == random_number) {
                System.out.println("You've won! " + random_number);
                // end the game
                isRunning = false;
            } else {
                tries = tries - 1;
                System.out.println("Wrong, " + tries + " left.");

                // check if the player has run out of tries.
                if (tries == 0) {
                    System.out.println("Game over. No more tries left!");
                    // end the game
                    isRunning = false;
                }
            }
        }
        // close scanner once game is over.
        scanner.close();
    }
}
