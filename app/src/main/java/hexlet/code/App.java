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
    private static final Scanner MAIN_SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET_OPTION + " - Greet");
        System.out.println(EVEN_OPTION + " - Even");
        System.out.println(CALC_OPTION + " - Calc");
        System.out.println(GCD_OPTION + " - GCD");
        System.out.println(PROGRESSION_OPTION + " - Progression");
        System.out.println(PRIME_OPTION + " - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int gameNumber = MAIN_SCANNER.nextInt();

        switch (gameNumber) {
            case GREET_OPTION -> Cli.greetUser();
            case EVEN_OPTION -> Even.evenGame();
            case CALC_OPTION -> Calc.calcGame();
            case GCD_OPTION -> NOD.nodGame();
            case PROGRESSION_OPTION -> Progression.progGame();
            case PRIME_OPTION -> PrimeNumber.primeGame();
            default -> System.out.println("Goodbye!");
        }
        MAIN_SCANNER.close();
    }
}
