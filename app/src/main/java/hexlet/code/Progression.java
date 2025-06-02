package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final Random RANDOM = new Random();

    public static void progGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");

        int correctAnswers = 0;
        final int rounds = 3;

        for (int j = 0; j < rounds; j++) {
            int number = RANDOM.nextInt(10);
            int[] progression = calculate();
            int correctAnswer = progression[number];
            StringBuilder questionBuilder = new StringBuilder();
            for (int i = 0; i < progression.length; i++) {
                if (i == number) {
                    questionBuilder.append("..");
                } else {
                    questionBuilder.append(progression[i]).append(" ");
                }
            }
            String question = questionBuilder.toString().trim();

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(String.valueOf(correctAnswer))) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        if (correctAnswers == rounds) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    private static int[] calculate() {
        int length = 10;
        int[] progression = new int[length];
        progression[0] = RANDOM.nextInt(50) + 1;
        int step = RANDOM.nextInt(10) + 1;

        for (int i = 1; i < length; i++) {
            progression[i] = progression[i-1] + step;
        }
        return progression;
    }
}
