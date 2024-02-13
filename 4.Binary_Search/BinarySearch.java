public class BinarySearch {
    /**
     * The BinarySearch class provides a static method for performing binary search
     * on an array of integers.
     * It uses the binary search algorithm to find the index of a given element in
     * the array.
     * The array must be sorted in ascending order for the binary search to work
     * correctly.
     * If the element is found, the method returns the index of the element in the
     * array.
     * If the element is not found, the method returns -1.
     *
     * Example usage:
     * int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
     * int index = BinarySearch.binarySearch(arr, 8);
     * System.out.println(index); // Output: 7
     */

    public static int binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at the mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore the left half
            if (arr[mid] < x)
                left = mid + 1;

            // If x is smaller, ignore the right half
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        System.out.println(binarySearch(arr, 8));
    }
}
