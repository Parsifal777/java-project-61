package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.NOD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET_OPTION = 1;
    private static final int EVEN_OPTION = 2;
    private static final int CALC_OPTION = 3;
    private static final int GCD_OPTION = 4;
    private static final int PROGRESSION_OPTION = 5;
    private static final int PRIME_OPTION = 6;
    private static final int EXIT_OPTION = 0;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();

        if (!SCANNER.hasNextInt()) {
            String userInput = SCANNER.nextLine();
            System.out.println("Error: Expected a number between "
                    + EXIT_OPTION + " and " + PRIME_OPTION
                    + ", but got '" + userInput + "'");
            return;
        }

        int gameNumber = SCANNER.nextInt();
        SCANNER.nextLine();

        if (gameNumber < EXIT_OPTION || gameNumber > PRIME_OPTION) {
            System.out.println("Error: Invalid game number '" + gameNumber
                    + "'. Please choose between " + EXIT_OPTION
                    + " and " + PRIME_OPTION);
            return;
        }

        switch (gameNumber) {
            case GREET_OPTION -> Cli.greetUser();
            case EVEN_OPTION -> Even.evenGame();
            case CALC_OPTION -> Calc.calcGame();
            case GCD_OPTION -> NOD.nodGame();
            case PROGRESSION_OPTION -> Progression.progGame();
            case PRIME_OPTION -> PrimeNumber.primeGame();
            case EXIT_OPTION -> System.out.println("Goodbye!");
            default -> System.out.println("Unexpected error for input: " + gameNumber);
        }

        SCANNER.close();
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET_OPTION + " - Greet");
        System.out.println(EVEN_OPTION + " - Even");
        System.out.println(CALC_OPTION + " - Calc");
        System.out.println(GCD_OPTION + " - GCD");
        System.out.println(PROGRESSION_OPTION + " - Progression");
        System.out.println(PRIME_OPTION + " - Prime");
        System.out.println(EXIT_OPTION + " - Exit");
        System.out.print("Your choice: ");
    }
}
