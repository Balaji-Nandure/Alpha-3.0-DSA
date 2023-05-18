public class XpowN {
    public static int xpown(int x, int n) {
        // basecase
        if (n == 0) {
            return 1;
        }

        // kaam
        return x * xpown(x, n - 1);
    }

    // More optimised
    // To reduce complexity to ologn
    // x^n = x^n/2 * x^n/2 (for even)
    // x^n = x * x^n/2 * x^n/2 (for odd)
    public static int xpown2(int x, int n) {
        // basecase
        if (n == 0) {
            return 1;
        }
        // kaam
        int halfPower = xpown2(x, n / 2);

        // for n is odd
        if (n % 2 != 0) {
            return x * halfPower * halfPower;
        } else {
            // for even
            return halfPower * halfPower;
        }

    }

    public static void main(String[] args) {
        System.out.println(xpown(2, 5));
        System.out.println(xpown2(2, 5));
    }
}
