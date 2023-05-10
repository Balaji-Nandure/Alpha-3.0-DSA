// odd > Lsb = 1
// even = Lsb = 0
//  to find lsb = n & 1

public class OddorEven {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        oddOrEven(56);
    }
}
