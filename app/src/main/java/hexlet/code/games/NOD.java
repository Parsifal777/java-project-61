package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class NOD {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 50;

    public static String[][] getGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (String[] roundData : gameData) {
            int number1 = Utils.getRandNumber(1, MAX_NUMBER);
            int number2 = Utils.getRandNumber(1, MAX_NUMBER);
            int correctAnswer = gcd(number1, number2);
            roundData[0] = number1 + " " + number2;
            roundData[1] = Integer.toString(correctAnswer);
        }
        return gameData;
    }

    private static int gcd(int number1, int number2) {
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
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }
}
