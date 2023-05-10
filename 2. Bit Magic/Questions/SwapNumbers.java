package Questions;

public class SwapNumbers {
    public static void main(String[] args) {
        // swap two numbers without using 3rd variable
        int x = 5;
        int y = 3;
        // Swap using xor
        x = x ^ y;
        y = x ^ y; // x
        x = x ^ y;

        System.out.println(x + ", " + y);
    }

}
