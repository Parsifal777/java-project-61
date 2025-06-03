package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void runGame(String gameDescription, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameDescription);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = gameData[i][0];
            String correctAnswer = gameData[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.nextLine().trim().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
