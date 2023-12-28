import java.util.Arrays;
import java.util.Scanner;

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
            System.out.println(Arrays.toString(arr));
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

    /**
     * Generates an array of random numbers from 0 to the specified upper bound.
     * 
     * @param arraySize  the size of the array
     * @param arrayBound the upper bound of the random numbers
     * @return the generated array of random numbers
     */

    public static int[] generateRandomArray(int arraySize, int arrayBound) {
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            // Generate random numbers from 0 to arrayBound
            array[i] = (int) (Math.random() * arrayBound);
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array and the upper bound of the random numbers: ");
        int arraySize = sc.nextInt(); // Size of the array
        int arrayBound = sc.nextInt(); // Upper bound of the random numbers
        int[] arr = generateRandomArray(arraySize, arrayBound);
        System.out.println("The generated array is: " + Arrays.toString(arr));

        bubbleSort(arr);
        // bubbleSortOptimized(arr);
        System.out.print("Bubble Sorted Array : " );
        System.out.println(Arrays.toString(arr));
    }
}
