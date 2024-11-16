package SEARCH_ALGORITHM;

public class BubbleSort {

    /**
     * Performs Bubble Sort on a given array.
     *
     * @param arr The array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop for each pass
        for (int i = 0; i < n; i++) {
            boolean swapped = false; // Flag to track if any swapping occurs

            // Inner loop to compare adjacent elements
            // The last i elements are already sorted
            for (int j = 1; j < n - i; j++) {
                // Compare the current element with the previous
                if (arr[j] < arr[j - 1]) {
                    // Swap if the current element is less than the previous
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true; // Mark as swapped
                }
            }

            // Print the array state after each pass
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);

            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Utility method to print an array.
     *
     * @param arr The array to be printed
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
    
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}
