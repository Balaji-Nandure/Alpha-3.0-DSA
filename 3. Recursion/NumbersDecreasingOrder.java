public class NumbersDecreasingOrder {
    public static void printDecreasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        printDecreasingOrder(10);
    }
}
