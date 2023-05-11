public class ArrayIsSorted {
    public static boolean isSorted(int arr[], int i) {
        // Base case
        // tc=O(n) , sc = O(n)
        if (i == arr.length - 1) {
            return true;
        }

        // kaam
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9 };
        System.out.println(isSorted(arr, 0));

    }
}
