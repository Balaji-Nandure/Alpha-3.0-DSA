public class Butterfly {
    public static void butterfly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // print start
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // print start
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Second Half
        for (int i = n; i >= 1; i--) {
            // print start
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // print start
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterfly(4);
    }
}
