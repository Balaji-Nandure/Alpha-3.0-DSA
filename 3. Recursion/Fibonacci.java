public class Fibonacci {
    public static int fibo(int n) {
        // Base Case
        if (n <= 1) {
            return 1;
        }
        // Kaam
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
