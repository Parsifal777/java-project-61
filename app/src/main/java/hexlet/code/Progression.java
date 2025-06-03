package hexlet.code;
import java.util.Random;

public class Progression {
    private static final Random RANDOM = new Random();
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int ROUNDS_COUNT = 3;

    public static String[][] getProgGame() {
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int j = 0; j < ROUNDS_COUNT; j++) {
            int number = RANDOM.nextInt(10);
            int[] progression = calculate();
            int correctAnswer = progression[number];
            StringBuilder questionBuilder = new StringBuilder();
            for (int i = 0; i < progression.length; i++) {
                if (i == number) {
                    questionBuilder.append("..");
                } else {
                    questionBuilder.append(progression[i]).append(" ");
                }
            }
            String question = questionBuilder.toString().trim();
            gameData[j][0] = question;
            gameData[j][1] = Integer.toString(correctAnswer);
        }
    return gameData;
    }
    private static int[] calculate() {
        int length = 10;
        int[] progression = new int[length];
        progression[0] = RANDOM.nextInt(50) + 1;
        int step = RANDOM.nextInt(10) + 1;

        for (int i = 1; i < length; i++) {
            progression[i] = progression[i-1] + step;
        }
        return progression;
    }
    public static void ProgGame() {
        Engine.runGame(GAME_DESCRIPTION, getProgGame());
    }
}
