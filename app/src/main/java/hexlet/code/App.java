package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final Scanner mainScanner = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();
        System.out.print("Your choice: ");
        String input = mainScanner.nextLine().trim();
        if (input.isEmpty()) {
            return;
        }
        int choice = Integer.parseInt(input);
        switch (choice) {
            case 1 -> Cli.greetUser();
            case 2 -> Even.evenGame();
            case 3 -> Calc.calcGame();
            case 4 -> NOD.nodGame();
            case 5 -> Progression.progGame();
            case 6 -> PrimeNumber.primeGame();
            case 0 -> System.out.println("Goodbye!");
            default -> System.out.println("Unknown command, try again!");
        }
    }

    private static void printMenu() {
        System.out.println("""
            Please enter the game number and press Enter
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""");
    }
}
