package BINARY_SEARCH;

public class BinarySearch {


    /**
     * Performs a binary search on an array that can be sorted in either ascending or descending order.
     *
     * @param arr The array to search
     * @param target The target value to find
     * @return The index of the target if found, otherwise -1
     */
    static int Search(int[] arr, int target) {
        int start = 0; // Starting index
        int end = arr.length - 1; // Ending index

        // Determine if the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        // Perform the binary search
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // Check if the target is found at mid
            if (arr[mid] == target) {
                return mid; // Return the index of the target
            }

            if (isAsc) {
                // Array is sorted in ascending order
                if (arr[mid] > target) {
                    // Target is in the left half
                    end = mid - 1;
                } else {
                    // Target is in the right half
                    start = mid + 1;
                }
            } else {
                // Array is sorted in descending order
                if (arr[mid] > target) {
                    // Target is in the right half
                    start = mid + 1;
                } else {
                    // Target is in the left half
                    end = mid - 1;
                }
            }
        }

        // Target not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test case 1: Array sorted in ascending order
        int[] ascArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Test case 2: Array sorted in descending order
        int[] desArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Search for target 2 in descending array
        System.out.println(Search(desArray, 2)); // Output: Index of 7
        
        // Search for target 7 in descending array
        System.out.println(Search(desArray, 7)); // Output: Index of 2
        
        // Search for a non-existent target (10)
        System.out.println(Search(desArray, 10)); // Output: -1



         // Search for target 2 in Ascending array
         System.out.println(Search(ascArray, 2)); // Output: Index of 1
        
         // Search for target 7 in Ascending array
         System.out.println(Search(ascArray, 7)); // Output: Index of 6
         
         // Search for a non-existent target (10)
         System.out.println(Search(ascArray, 10)); // Output: -1
    }
}
 
