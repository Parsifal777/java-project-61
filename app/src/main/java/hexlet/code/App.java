package hexlet.code;
import java.util.Scanner;

public class App {
    private static Scanner mainScanner = new Scanner(System.in);
    public static void main(String[] args) {
        printMenu();
        while (true) {
            try {
                System.out.print("Your choice: ");
                String input = mainScanner.nextLine().trim();
                if (input.isEmpty()) {
                    continue;
                }
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1 -> Cli.greetUser();
                    case 2 -> Even.evenGame();
                    case 3 -> Calc.calcGame();
                    case 4 -> NOD.nodGame();
                    case 5 -> Progression.ProgGame();
                    case 6 -> PrimeNumber.PrimeGame();
                    case 0 -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Unknown command, try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number!");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                e.printStackTrace();
            }
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