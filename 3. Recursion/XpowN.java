public class XpowN {
    public static int xpown(int x, int n) {
        // basecase
        if (n == 0) {
            return 1;
        }

        // kaam
        return x * xpown(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(xpown(2, 3));
    }
}
