public class TilingProblem {
    public static int tiling(int n) {
        // given 2*n board and tile of 2*1, count the number of ways to tile the board.
        // for n=0 , ways =1 (not keeping any tile is also a way here)
        // for n=1 , ways =1
        // for n=2 , ways =2
        // for n=3 , ways =3

        // basecase
        if (n == 0 || n == 1) {
            return 1;
        }
        // choice - vertical or horizontal
        // Kaam
        // vertical chooice
        int verticalChoice = tiling(n - 1);
        // horizontal choice
        int horizontalChoice = tiling(n - 2);
        int totalWays = verticalChoice + horizontalChoice;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tiling(9));
    }
}
