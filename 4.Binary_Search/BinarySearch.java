public class BinarySearch {

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
        System.out.println(binarySearch(arr, 0));
    }
}
