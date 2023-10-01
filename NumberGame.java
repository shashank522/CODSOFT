import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;
        boolean playAgain = true;
        System.out.println("\nWelcome to the Number Guessing Game!");
        while (playAgain)
        {
            int target = r.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("\nA number has been generated between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");
            int attempts = 0;
            while (attempts < maxAttempts)
            {
                System.out.println("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;
                if (guess == target)
                {
                    System.out.println("Congratulations! You guessed the number correctly. ");
                    score += maxAttempts - attempts + 1;
                    break;
                } else if (guess < target)
                {
                    System.out.println("Too low! Try again.");
                } else
                {
                    System.out.println("Too high! Try again.");
                }
                if (attempts == maxAttempts)
                {
                    System.out.println("Sorry, No more attempts left. The number was: " + target);
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String Response = sc.next();
            playAgain = Response.equalsIgnoreCase("yes");
        }
        System.out.println("Your score: " + score);
        sc.close();
    }
}