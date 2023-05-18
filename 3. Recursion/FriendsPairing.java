public class FriendsPairing {
    // given n friends, each can remain single or can pair up. find number of ways
    // if each friend can make only one pair
    public static int friendsPairing(int n) {
        // similar to choice making.
        if (n == 0 || n == 1) {
            return n;
        }
        // choice
        int single = friendsPairing(n - 1);
        int pair = friendsPairing(n - 2);

        int ways = single + (n - 1) * pair;
        return ways;
    }

    public static void main(String[] args) {

        System.out.println(friendsPairing(5));
    }
}