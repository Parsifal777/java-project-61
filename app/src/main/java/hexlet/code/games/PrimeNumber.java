package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[][] getPrimeGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandNumber(1, 100);
            gameData[i][0] = Integer.toString(number);
            gameData[i][1] = isPrime(number) ? "yes" : "no";
        }
    return gameData;
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeGame() {
        Engine.runGame(GAME_DESCRIPTION, getPrimeGame());
    }
}
