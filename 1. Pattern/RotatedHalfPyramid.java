public class RotatedHalfPyramid {
    public static void rotatedHalfPyramid(int n) {
        // first fo to rows
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rotatedHalfPyramid(5);
    }
}
