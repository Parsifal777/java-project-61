package hexlet.code.Games;
import hexlet.code.Utils;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] getEvenGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandNumber(1, 100);
            gameData[i][0] = Integer.toString(number);
            gameData[i][1] = number % 2 == 0 ? "yes" : "no";
        }
    return gameData;
    }

    public static void evenGame() {
        Engine.runGame(GAME_DESCRIPTION, getEvenGame());
    }
}