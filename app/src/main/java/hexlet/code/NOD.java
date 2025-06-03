package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class NOD {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int ROUNDS_COUNT = 3;

    public static String[][] getNodGame() {
        Random random = new Random();
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number1 = random.nextInt(50) + 1;
            int number2 = random.nextInt(50) + 1;
            int correctAnswer = findBest(number1, number2);
            gameData[i][0] = number1 + " " + number2;
            gameData[i][1] = Integer.toString(correctAnswer);
        }
    return gameData;
    }
    private static int findBest(int number1, int number2) {
        int a = number1;
        int b = number2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }
    public static void nodGame() {
        Engine.runGame(GAME_DESCRIPTION, getNodGame());
    }
}

