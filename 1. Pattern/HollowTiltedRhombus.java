public class HollowTiltedRhombus {
    public static void hollowTiltedRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Pirnt hollow rectangle
            for (int j = 1; j <= n; j++) {
                // if border element > print *
                // otherwise print " "
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowTiltedRhombus(5);
    }
}
