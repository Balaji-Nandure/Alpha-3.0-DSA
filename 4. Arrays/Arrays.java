public class Arrays {
    // print array
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    // tc = O(n)
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // tc = O(n)
    public static int largestNum(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // tc = O(n)
    public static int smallestNum(int arr[]) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    // tc = Olog(n)
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int arr[]) {
        // No extra space
        // two pointer approach
        int first = 0, last = arr.length - 1;
        while (first < last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        // printarray(numbers);
        // System.out.println(linearSearch(numbers, 15));
        // System.out.println(largestNum(numbers));
        // System.out.println(smallestNum(numbers));
        // System.out.println(binarySearch(numbers, 11));

        reverse(numbers);
        printarray(numbers);
    }
}
