package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calcGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;
        final int rounds = 3;
        final String[] operations = {" + ", " - ", " * "};
        for (int i = 0; i < rounds; i++) {
            int number1 = random.nextInt(100) + 1;
            int number2 = random.nextInt(100) + 1;
            String operation = operations[random.nextInt(operations.length)];

            int correctAnswer = calculate(number1, number2, operation);
            System.out.println("Question: " + number1 + operation + number2);
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

    private static int calculate(int a, int b, String operation) {
        return switch (operation.trim()) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }
}