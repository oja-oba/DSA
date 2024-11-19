package SEARCH_ALGORITHM;

import java.util.Arrays;

public class SelectionSort {


    /**
     * Sorts the array in ascending order using the Selection Sort algorithm.
     * 
     * @param arr The array to be sorted
     */
    static void Selection(int[] arr) {
        // Iterate through the array from start to end
        for (int i = 0; i < arr.length; i++) {
            // Calculate the index of the last unsorted element
            int lastIndex = arr.length - i - 1;

            // Find the index of the maximum element in the unsorted portion of the array
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            // Swap the maximum element with the last unsorted element
            swap(arr, maxIndex, lastIndex);
        }
    }

    /**
     * Swaps two elements in the array.
     * 
     * @param arr   The array where the swap will occur
     * @param first The index of the first element
     * @param second The index of the second element
     */
    static void swap(int[] arr, int first, int second) {
        // Store the first element in a temporary variable
        int temp = arr[first];

        // Assign the value of the second element to the first element
        arr[first] = arr[second];

        // Assign the value of the temporary variable to the second element
        arr[second] = temp;
    }

    /**
     * Finds the index of the maximum element in a given range of the array.
     * 
     * @param arr   The array to search
     * @param start The starting index of the range
     * @param end   The ending index of the range
     * @return The index of the maximum element in the range
     */
    static int getMaxIndex(int[] arr, int start, int end) {
        // Assume the first element in the range is the largest
        int max = start;

        // Iterate through the range to find the actual maximum element
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i; // Update max if a larger element is found
            }
        }
        return max; // Return the index of the maximum element
    }


    // Main method for testing
    public static void main(String[] args) {
        // Define an array to be sorted
        int[] arr = {4, 5, 6, 9, 1, 3, 2, 8, 7};

        // Perform Selection Sort on the array
        Selection(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }



}
