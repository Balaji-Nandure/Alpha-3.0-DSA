public class Factorial {
    // tc = o(n), Sc = o(n) // remember call stack will take space
    public static int factorial(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // Kaam and function call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(15));
    }
}
