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
                    case 1:
                        Cli.greetUser();
                    case 2:
                        Even.evenGame();
                    case 3:
                        Calc.calcGame();
                    case 4:
                        NOD.nodGame();
                    case 5:
                        Progression.progGame();
                    case 6:
                        PrimeNumber.PrimeGame();
                    case 0:
                        System.out.println("Goodbye!");
                        mainScanner.close();
                        return;
                    default:
                        System.out.println("Unknown command, try again!");
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
        System.out.println("\nPlease enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }
}