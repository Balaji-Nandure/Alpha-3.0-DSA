public class LastOccurance {
    public static int lastsOccurance(int arr[], int key, int i) {
        // basecasee
        if (i == arr.length) {
            return -1;
        }
        // kaam
        // Look forward > then compare with self
        int isFound = lastsOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(lastsOccurance(arr, 5, 0));
    }
}
