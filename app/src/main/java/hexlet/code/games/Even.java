package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static String[][] getGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (String[] roundData : gameData) {
            int number = Utils.getRandNumber(1, MAX_NUMBER);
            String correctAnswer = isEven(number) ? "yes" : "no";
            roundData[0] = Integer.toString(number);
            roundData[1] = correctAnswer;
        }
        return gameData;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void evenGame() {
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }
}
