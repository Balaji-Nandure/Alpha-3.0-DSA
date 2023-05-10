public class checkIfNumberIsPowerOfTwo {
    // idea (for 2^n) n & (n-1) == 0;
    public static boolean isTwoPow(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isTwoPow(3));
    }
}
