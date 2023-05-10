public class UpdateIthBit {
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0){
        // // return ClearIthBit(n,i);
        // } else {
        // // return setIthBit(n,i);
        // }

        // (OR) new logic
        // first cleat ith bit
        // n =clearIthBit(n,i)
        int bitmask = newBit << i;
        return n | bitmask;

    }

    public static void main(String[] args) {

    }
}
