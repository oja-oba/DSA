package BINARY_SEARCH;

import java.util.Arrays;

/**
 * Binary Search for First and Last Index
 * 
 * This program finds the first and last occurrences of a target value in a sorted array.
 * It uses binary search to achieve an efficient solution.
 * 
 * Author: Ojaoba
 * Date: 11/19/2024
 */

public class FirstAndLast {


    /**
     * Finds the first and last index of a target in a sorted array.
     *
     * @param arr The sorted array (in ascending order)
     * @param target The target value to search for
     * @return An array containing the first and last index of the target, or [-1, -1] if not found
     */
    static int[] firstAndLastIndex(int[] arr, int target) {
        int[] result = {-1, -1}; // Default result if the target is not found

        // Find the first occurrence of the target
        int firstIndex = search(arr, target, true);

        // Find the last occurrence of the target
        int lastIndex = search(arr, target, false);

        // Store the results
        result[0] = firstIndex;
        result[1] = lastIndex;

        return result;
    }

    /**
     * Binary search helper method to find the target index.
     *
     * @param arr The sorted array
     * @param target The target value to search for
     * @param firstIndex True if searching for the first occurrence, false for the last occurrence
     * @return The index of the target (first or last occurrence), or -1 if not found
     */
    static int search(int[] arr, int target, boolean firstIndex) {
        int result = -1; // Default result if the target is not found
        int start = 0; // Start index of the search range
        int end = arr.length - 1; // End index of the search range

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index

            if (target > arr[mid]) {
                // Target is greater than the middle element, search the right half
                start = mid + 1;
            } else if (target < arr[mid]) {
                // Target is smaller than the middle element, search the left half
                end = mid - 1;
            } else {
                // Target matches the middle element
                result = mid; // Store the index
                if (firstIndex) {
                    // If searching for the first occurrence, narrow the range to the left
                    end = mid - 1;
                } else {
                    // If searching for the last occurrence, narrow the range to the right
                    start = mid + 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 6, 7, 8};

        // Test cases
        System.out.println(Arrays.toString(firstAndLastIndex(arr, 2))); // Output: [1, 1]
        System.out.println(Arrays.toString(firstAndLastIndex(arr, 6))); // Output: [7, 10]
        System.out.println(Arrays.toString(firstAndLastIndex(arr, 3))); // Output: [2, 4]
        System.out.println(Arrays.toString(firstAndLastIndex(arr, 9))); // Output: [-1, -1]
    }
}

