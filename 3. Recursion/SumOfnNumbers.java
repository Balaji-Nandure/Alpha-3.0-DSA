public class SumOfnNumbers {
    // sum = n*((n+1)/2)
    // TC = SC = O(n)
    public static int sumOfnNumbers(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        // Kaam
        return n + sumOfnNumbers(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfnNumbers(5));
        ;
    }
}