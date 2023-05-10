public class CountSetBits {
    // tc = Log(n)
    public static int countSetBits(int n) {
        int count = 0;
        // run untill number is zero
        while (n > 0) {
            // check last bit
            if ((n & 1) == 1) {
                count++;
            }
            // leftshift number (or divide by two)
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
