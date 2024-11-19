package BINARY_SEARCH;

public class Ceiling {

    /**
     * Finds the ceiling of a target in a sorted array.
     * The ceiling of a target is the smallest number in the array that is greater than or equal to the target.
     *
     * @param arr The sorted array (in ascending order)
     * @param target The target value to find the ceiling for
     * @return The index of the ceiling value, or -1 if no ceiling exists
     */
    static int ceiling(int[] arr, int target) {
        // If the target is greater than the largest element in the array, no ceiling exists.
        if (target > arr[arr.length - 1]) {
            return -1;
        }

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

        // When the loop exits, 'start' points to the index of the smallest number >= target
        return start;
    }


        //The main method for testing the code
    public static void main(String[] args) {
        // Example array (sorted in ascending order)
        int[] arr = {2, 3, 5, 6, 7, 8, 9};

        // Test cases
        System.out.println(ceiling(arr, 1)); // Output: Index of the smallest number >= 1
        System.out.println(ceiling(arr, 4)); // Output: Index of the smallest number >= 4
        System.out.println(ceiling(arr, 6)); // Output: Index of the smallest number >= 6
        System.out.println(ceiling(arr, 10)); // Output: -1 (target is greater than the largest element)
    }
}

