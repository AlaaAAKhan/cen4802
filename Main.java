public class Main {
    public static void main(String[] args) {
        int nthTerm = 10;
        System.out.println("The " + nthTerm + "th term of the Fibonacci Sequence is " + fibonacci(nthTerm));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}