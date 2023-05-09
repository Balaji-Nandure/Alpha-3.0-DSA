public class HalfPyramidCharacter {
    public static void halfPyramidCharacter(int n) {
        char currentChar = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfPyramidCharacter(5);
    }
}
