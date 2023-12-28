import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimized(int[] arr) {
        // Optimized version of bubble sort: One way to optimize the Bubble Sort
        // algorithm is to add a flag that checks if a swap has occurred in the inner
        // loop. If no swap has occurred in a complete pass of the inner loop, it means
        // the array is already sorted and there's no need to continue with further
        // passes. This optimization makes Bubble Sort perform well on already sorted
        // (or nearly sorted) lists, reducing the time complexity to O(n) in the best
        // case.
        
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                // If no two elements were swapped by inner loop, then break
                if (swapped == false) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 4, 7, 4, 5, 9, 1, 2, 8 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
