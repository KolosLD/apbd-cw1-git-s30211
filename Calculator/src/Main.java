public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        int a = 10;
        int b = 5;

        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static int calculateMax(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = values[0];
        for (int v : values) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}