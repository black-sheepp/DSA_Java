import java.util.Arrays;
import java.util.Scanner;

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
