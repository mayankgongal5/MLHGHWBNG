import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create an array of choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user's choice
        System.out.println("Enter your choice (Rock, Paper, or Scissors):");
        String userChoice = scanner.next();

        // Validate user input
        if (!isValidChoice(userChoice)) {
            System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
            return;
        }

        // Generate computer's choice randomly
        Random random = new Random();
        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        // Display choices
        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer's choice: " + computerChoice);

        // Determine the winner
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);
    }

    // Validate user input
    private static boolean isValidChoice(String choice) {
        return choice.equalsIgnoreCase("Rock") ||
               choice.equalsIgnoreCase("Paper") ||
               choice.equalsIgnoreCase("Scissors");
    }

    // Determine the winner based on the game rules
    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
