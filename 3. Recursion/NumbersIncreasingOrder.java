public class NumbersIncreasingOrder {
    public static void printIncreasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasingOrder(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printIncreasingOrder(10);
    }
}
