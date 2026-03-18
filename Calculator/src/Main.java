public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        int a = 10;
        int b = 5;

        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + subtract(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}