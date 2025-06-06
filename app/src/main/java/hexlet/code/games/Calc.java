package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static String[][] getGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (String[] roundData : gameData) {
            int number1 = Utils.getRandNumber(1, MAX_NUMBER);
            int number2 = Utils.getRandNumber(1, MAX_NUMBER);
            String operator = OPERATORS[Utils.getRandNumber(0, OPERATORS.length - 1)];

            roundData[0] = number1 + " " + operator + " " + number2;
            roundData[1] = Integer.toString(calculate(number1, number2, operator));
        }
        return gameData;
    }

    private static int calculate(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }

    public static void calcGame() {
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }
}
