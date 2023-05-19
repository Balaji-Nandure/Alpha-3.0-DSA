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

    // Pairs in an array
    // remember pair is of always 2 members
    // tc = O(n^2)
    public static void printPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
            }
            System.out.println();
        }

    }

    // Print subarrays (continuous)
    // tc=o(n^3)
    public static void printSubarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Maximum subarray sum
    // tc=o(n^3)
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("maxSum = " + maxSum);
    }

    // prefix sum approach
    // tc=o(n^2), sc=O(n)
    public static void maxSubarraySum2(int arr[]) {
        int currSum = 0;
        int maxSum = arr[0];
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // to calculate prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("maxSum = " + maxSum);
    }

    // Most optimised
    // Kadane's algorithm
    // tc=o(n)
    // wherever current sum becomes negative, make it 0.
    // this code is not for array in which all the elements are negative
    public static void maxSubarraySum3(int arr[]) {
        int currSum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("maxSum = " + maxSum);
    }

    // Trapping rainwater
    // compute how much water will be trapped after first rain

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int arr[] = { 1, -2, 6, -1, 3 };
        int arr2[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // printarray(numbers);
        // System.out.println(linearSearch(numbers, 15));
        // System.out.println(largestNum(numbers));
        // System.out.println(smallestNum(numbers));
        // System.out.println(binarySearch(numbers, 11));

        // reverse(numbers);
        // printarray(numbers);

        // printPairs(numbers);
        // printSubarrays(numbers);
        // maxSubarraySum(arr);
        // maxSubarraySum2(arr);
        maxSubarraySum3(arr2);
    }
}
