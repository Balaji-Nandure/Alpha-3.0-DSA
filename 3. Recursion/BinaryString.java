public class BinaryString {
    // print all binary strings of size n without consecutive ones.
    public static void printBinaryString(int n, int lastPlace, String str) {

        // basecase
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        if (lastPlace == 0) {
            printBinaryString(n - 1, 0, str + "0");
            printBinaryString(n - 1, 1, str + "1");
        } else {
            printBinaryString(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        printBinaryString(5, 0, "");
    }
}
