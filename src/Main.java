import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //ROCK PAPER SCISSORS GAME

        //DECLARE VARIABLES
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        //GET CHOICE FROM USER
        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue; //this takes you back to the beginning if someone inputs something valid
            }

            //GET RANDOM CHOICE FROM COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            //CHECK WINNER
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            //ASK TO PLAY AGAIN
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        //GOODBYE MESSAGE
        System.out.println("Goodbye! Thanks for playing.");


        scanner.close();
    }
}