public class PalindromeNumbersPattern {
    public static void palindromeNumbersPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // print pattern first half part
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // print pattern second half part
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromeNumbersPattern(5);
    }
}
