package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 50;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

    public static String[][] getGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (String[] roundData : gameData) {
            int firstElem = Utils.getRandNumber(MIN_START, MAX_START);
            int step = Utils.getRandNumber(MIN_STEP, MAX_STEP);
            String[] progression = generateProgression(firstElem, step, PROGRESSION_LENGTH);

            int hiddenIndex = Utils.getRandNumber(0, PROGRESSION_LENGTH - 1);
            String correctAnswer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            roundData[0] = question;
            roundData[1] = correctAnswer;
        }
        return gameData;
    }

    private static String[] generateProgression(int firstElem, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(firstElem + i * step);
        }
        return progression;
    }

    public static void progGame() {
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }
}
