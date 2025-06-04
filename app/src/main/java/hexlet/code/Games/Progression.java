package hexlet.code.Games;
import hexlet.code.Utils;

public class Progression {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;

    public static String[][] getProgGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            String[] progression = generateProgression();
            int hiddenIndex = Utils.getRandNumber(0, PROGRESSION_LENGTH - 1);
            String correctAnswer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        return gameData;
    }

    private static String[] generateProgression() {
        String[] progression = new String[PROGRESSION_LENGTH];
        int first = Utils.getRandNumber(1, 50);
        int step = Utils.getRandNumber(1, 10);

        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }

    public static void ProgGame() {
        Engine.runGame(GAME_DESCRIPTION, getProgGame());
    }
}