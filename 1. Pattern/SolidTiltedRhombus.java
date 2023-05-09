public class SolidTiltedRhombus {
    public static void solidTiltedRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Pirnt stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidTiltedRhombus(5);
    }
}
