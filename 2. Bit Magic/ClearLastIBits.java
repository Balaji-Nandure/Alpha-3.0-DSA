public class ClearLastIBits {
    public static int clearLastIBits(int n, int i) {
        int bitmask = (~0) << i;
        // (~0) = -1
        // int bitmask = (-1) << i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearLastIBits(12, 2));
    }
}
