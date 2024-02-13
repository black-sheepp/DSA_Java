import java.util.Arrays;
import java.util.Scanner;

/**
 * The QuickSort class provides methods for performing the QuickSort algorithm on an array of integers.
 * 
 * The class includes a static method 'quickSort' that takes an array of integers as input and sorts it in ascending order using the QuickSort algorithm.
 * 
 * The class also includes a static method 'generateRandomArray' that generates a random array of integers with a specified size and upper bound for the random numbers.
 * 
 * The main method of the class demonstrates the usage of the 'quickSort' method by generating a random array, sorting it using QuickSort, and printing the sorted array.
 * 
 * Example usage:
 * 
 *     int[] array = QuickSort.generateRandomArray(10, 100);
 *     System.out.println("Original array: " + Arrays.toString(array));
 *     
 *     QuickSort.quickSort(array);
 *     System.out.println("Sorted array: " + Arrays.toString(array));
 * 
 * This class requires the 'java.util.Arrays' and 'java.util.Scanner' packages to be imported.
 */


public class QuickSort {

    public static void quickSort(int[] arr) {
        
    }

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
        int[] array = generateRandomArray(arraySize, arrayBound);
        System.out.println("The generated array is: " + Arrays.toString(array));

        System.out.print("Quick Sort Array : ");
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
