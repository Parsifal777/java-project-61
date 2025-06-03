package hexlet.code;
import java.util.Random;

public class PrimeNumber {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int ROUNDS_COUNT = 3;

    public static String[][] getPrimeGame() {
        Random random = new Random();
        String[][] gameData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(100);
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
    public static void PrimeGame() {
        Engine.runGame(GAME_DESCRIPTION, getPrimeGame());
    }
}
