import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        welcome();

        // Declare a built-in Java Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int secondNumber = scanner.nextInt();

        // Closes the scanner to prevent memory leaks
        scanner.close();

        add(firstNumber, secondNumber);
        int product = multiply(firstNumber, secondNumber);
        int sum = subtract(firstNumber, secondNumber);
        int cube = cube(firstNumber);

        System.out.println("Multiply result: " + product);
        System.out.println("Sum result: " + sum);
        System.out.println("Cube result: " + cube);

    }

    public static void welcome() {
        System.out.println("Welcome to calculator!");
    }

    public static void add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;

        System.out.println("Addition result: " + result);
    }

    public static int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;

        return result;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;

        return result;
    }

    public static int cube(int number) { 
        int result = number * number * number;

        return result;
    }
}
