package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;
        final int rounds = 3;
        for (int i = 0; i < rounds; i++) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim().toLowerCase();

            boolean isEven = number % 2 == 0;
            boolean isCorrect = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));

            if (isCorrect) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                String correctAnswer = isEven ? "yes" : "no";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        if (correctAnswers == rounds) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}