package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static String[][] getGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (String[] roundData : gameData) {
            int number = Utils.getRandNumber(1, MAX_NUMBER);
            roundData[0] = Integer.toString(number);
            roundData[1] = isPrime(number) ? "yes" : "no";
        }
        return gameData;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }
}
