package BINARY_SEARCH;

/**
 * Floor Algorithm
 * 
 * The floor of a target is the greatest number in a sorted array that is less than or equal to the target.
 * This implementation uses binary search for an efficient solution.
 * 
 * Author: Ojaoba
 * Date: 1//19/2024
 */

 public class Floor {

    public static void main(String[] args) {
        // Example array (sorted in ascending order)
        int[] arr = {2, 3, 5, 6, 7, 8, 9};

        // Test cases
        System.out.println(floor(arr, 1)); // Output: -1 (No floor exists)
        System.out.println(floor(arr, 4)); // Output: Index of 3 
        System.out.println(floor(arr, 6)); // Output: Index of 6
        System.out.println(floor(arr, 10)); // Output: Index of 9
    }

    /**
     * Finds the floor of a target in a sorted array.
     * The floor of a target is the greatest number in the array that is less than or equal to the target.
     *
     * @param arr The sorted array (in ascending order)
     * @param target The target value to find the floor for
     * @return The index of the floor value, or -1 if no floor exists
     */
    static int floor(int[] arr, int target) {
        int start = 0; // Start index of the search range
        int end = arr.length - 1; // End index of the search range

        // Binary search loop
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // If the target is greater than the middle element, search the right half
            if (target > arr[mid]) {
                start = mid + 1;
            } 
            // If the target is smaller than the middle element, search the left half
            else if (target < arr[mid]) {
                end = mid - 1;
            } 
            // If the target matches the middle element, return its index
            else {
                return mid;
            }
        }

        // When the loop exits, 'end' points to the index of the largest number <= target
        return end;
    }
}
