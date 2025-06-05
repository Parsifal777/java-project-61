package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static String[][] getGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = Utils.getRandNumber(1, 100);
            int b = Utils.getRandNumber(1, 100);
            String operation = OPERATIONS[Utils.getRandNumber(0, OPERATIONS.length - 1)];
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