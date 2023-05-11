// when we have only one recursion call then this will take linear SC
// but in this case we have two recursion call > it will create Tree structure e.g in this case
// It will take o(2^n) // 2 because it is calling recursion twice
// Later we will study Dynamic Programming

public class Fibonacci {
    // TC = O(2^n) SC = O(n)
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
