import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int target = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        System.out.println("🎮 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("📉 Too low! Try again.");
            } else if (guess > target) {
                System.out.println("📈 Too high! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed it!");
                System.out.println("Total attempts: " + attempts);
            }
        }
    }
}
