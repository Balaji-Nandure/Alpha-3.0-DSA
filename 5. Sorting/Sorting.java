public class Sorting {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    // Bubble sort
    // find largest element and push it at the end
    // tc=O(n^2)
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort
    // find smallest element (from unsorted) and push it at the start
    // tc=O(n^2)
    // number of swaps reduced in selection sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }

            // swap outside the inner loop
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    // Insertion sort
    // pick an element from u

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        // bubbleSort(arr);
        // printarray(arr);

        selectionSort(arr);
        printarray(arr);
    }
}
