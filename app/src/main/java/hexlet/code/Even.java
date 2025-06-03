package hexlet.code;
import java.util.Random;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int ROUNDS_COUNT = 3;
    public static String[][] getEvenGame() {
        Random random = new Random();
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(100);
            gameData[i][0] = Integer.toString(number);
            gameData[i][1] = number % 2 == 0 ? "yes" : " no";
        }
    return gameData;
    }
    public static void evenGame() {
        Engine.runGame(GAME_DESCRIPTION, getEvenGame());
    }
}