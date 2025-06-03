package hexlet.code;
import java.util.Random;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final int ROUNDS_COUNT = 3;

    public static String[][] getGameData() {
        Random random = new Random();
        String[][] gameData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int a = random.nextInt(100) + 1;
            int b = random.nextInt(100) + 1;
            String operation = OPERATIONS[random.nextInt(OPERATIONS.length)];
            gameData[i][0] = a + " " + operation + " " + b;
            gameData[i][1] = Integer.toString(calculate(a, b, operation));
        }
        return gameData;
    }

    private static int calculate(int a, int b, String operation) {
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }

    public static void calcGame() {
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }
}