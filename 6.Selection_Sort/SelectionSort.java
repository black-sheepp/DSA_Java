/*
 * Selection sort is a simple sorting algorithm that repeatedly finds the minimum element
 * from the unsorted part of the array and puts it at the beginning.
 */

import java.util.Arrays;

/**
 * The SelectionSort class implements the selection sort algorithm to sort an
 * array of integers in ascending order.
 * The selection sort algorithm works by repeatedly finding the minimum element
 * from the unsorted part of the array
 * and swapping it with the first element of the unsorted part. This process is
 * repeated until the entire array is sorted.
 * 
 * Example usage:
 * 
 * int[] arr = { 2, 5, 3, 7, 1, 6, 2, 3, 4, 5, 6, 7 };
 * SelectionSort.selectionSort(arr);
 * System.out.println(Arrays.toString(arr)); // Output: [1, 2, 2, 3, 3, 4, 5, 5,
 * 6, 6, 7, 7]
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element in the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 7, 1, 6, 2, 3, 4, 5, 6, 7 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
