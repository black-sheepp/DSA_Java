import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) { // Start from the second element

            for (int j = i; j > 0; j--) { // The inner loop will run as long as j > 0
                if (arr[j] < arr[j - 1]) {
                    // Swap arr[j] and arr[j - 1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    // Stop the inner loop
                    break;
                }
            }
        }
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

        System.out.print("Insertion Sort : ");
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
