public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(add(5, 10));
        System.out.println(subtract(5, 10));
        System.out.println(multiply(5, 10));
        System.out.println(divide(5, 10));

        System.out.println(Math.cos(.5));
        System.out.println(Math.sin(.5));
        System.out.println(Math.PI);
        System.out.println(Math.random());
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
