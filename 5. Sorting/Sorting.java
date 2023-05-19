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
    // pick an element from unsorted part and place in the right position in sorted
    // tc=O(n^2)
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

    }

    // counting sort
    // tc=O(n+k)
    // if (maxNum - minNum) is small, then we can use counting sort for
    public static void countingSort(int arr[]) {
        int n = arr.length;
        int largest = arr[0];
        // find largest element
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // make count array
        int count[] = new int[largest + 1]; // largest+1 because 0 is also included

        // count frequency
        for (int i = 0; i < n; i++) {
            // take number as index in count array
            count[arr[i]]++;
        }

        // sorting
        // iterate over count array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        int[] counting = { 1, 4, 1, 3, 2, 4, 3, 7 };

        // bubbleSort(arr);
        // printarray(arr);

        // selectionSort(arr);
        // printarray(arr);

        // insertionSort(arr);
        // printarray(arr);

        countingSort(counting);
        printarray(counting);

    }
}
