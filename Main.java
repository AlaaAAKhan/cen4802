/**
 * Alaa Khan
 * CEN4802 - Software Integration, Configuration, and Testing
 * Assignment 1
 * 25 January 2026
 */
public class Main {
    /**
     * The Main method. Calls the Fibonacci method.
     * @param args - An array of String variables
     */
    public static void main(String[] args) {
        int nthTerm = 10;
        System.out.println("The " + nthTerm + "th term of the Fibonacci Sequence is " + fibonacci(nthTerm));
    }

    /**
     * Performs the Fibonacci sequence on a given variable n.
     * @param n - The number nth the sequence that the method tries to find the number of.
     * @return - The number in the nth position as defined by the paramter.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}