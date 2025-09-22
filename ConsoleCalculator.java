import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleCalculator {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        while (true) {
            clearScreen();
            printMenu();
            int choice = getIntInput("Enter your choice (1-5): ");
            if (choice == 5) {
                clearScreen();
                System.out.println("Calculator exited. Goodbye!");
                break;
            }
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice! Press Enter to try again...");
                sc.nextLine();
                sc.nextLine();
                continue;
            }
            clearScreen();
            double num1 = getDoubleInput("Enter first number: ");
            double num2 = getDoubleInput("Enter second number: ");
            double result = 0;
            switch (choice) {
                case 1: result = calc.add(num1, num2); break;
                case 2: result = calc.subtract(num1, num2); break;
                case 3: result = calc.multiply(num1, num2); break;
                case 4: result = calc.divide(num1, num2); break;
            }
            System.out.println("Result: " + result);
            System.out.println("Press Enter to continue...");
            sc.nextLine();
            sc.nextLine();
        }
    }

    private static void printMenu() {
        System.out.println("==== Basic Calculator ====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                sc.nextLine();
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                sc.nextLine();
            }
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

