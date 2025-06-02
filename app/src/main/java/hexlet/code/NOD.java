package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class NOD {
    public static void nodGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswers = 0;
        final int rounds = 3;
        for (int i = 0; i < rounds; i++) {
            int number1 = random.nextInt(50) + 1;
            int number2 = random.nextInt(50) + 1;
            int a = number1;
            int b = number2;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int correctAnswer = a;

            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Your answer: ");
            try {
                int userAnswer = scanner.nextInt();
                scanner.nextLine();
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                scanner.nextLine();
                i--;
                continue;
            }
        }
        if (correctAnswers == rounds) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

