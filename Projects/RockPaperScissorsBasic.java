import java.util.Random;
import java.util.Scanner;

/**
 * Rock Paper Scissors Game
 */
public class RockPaperScissorsBasic {
    public static void main(String[] args) {
        // Create scanner and random object
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Introduction message for the game
        System.out.println("\n----- Rock Paper Scissors Game --------------->\n");

        // Generate a random choice for the bot (0: Rock, 1: Paper, 2: Scissors)
        int bot = random.nextInt(3);

        // For DEBUGGING, delete/comment out the following line when playing
        System.out.println(bot);

        // Print the list of options for the player to choose from
        System.out.println("Press keys\n" +
                "0. Rock\n" +
                "1. Paper\n" +
                "2. Scissors\n");

        // Get the player's choice
        int choice = scanner.nextInt();
        scanner.nextLine();

        // Determine the result of the game and print the outcome
        if (choice == bot) {
            System.out.println("It's a tie.");
        } else if ((choice == 0 && bot == 2) || (choice == 1 && bot == 0) || (choice == 2 && bot == 1)) {
            System.out.println("You win.");
        } else {
            System.out.println("Game over. You lose.");
        }

        // Display the choices made by both the player and the bot
        System.out.println("You chose: " + choice + "\n" + "Bot chose: " + bot);

        // End message for the game
        System.out.println("\n----- Game Over ------------------------------>\n");

        // Close the scanner
        scanner.close();
    }
}
