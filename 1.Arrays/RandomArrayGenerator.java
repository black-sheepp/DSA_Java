import java.util.Arrays;
import java.util.Scanner;

/**
 * The RandomArrayGenerator class provides a method to generate an array of random numbers.
 */
public class RandomArrayGenerator {

    /**
     * Generates an array of random numbers from 0 to the specified upper bound.
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
        int arraySize = sc.nextInt();  // Size of the array
        int arrayBound = sc.nextInt(); // Upper bound of the random numbers

        int[] array = generateRandomArray(arraySize, arrayBound);

        System.out.println("The generated array is: " + Arrays.toString(array));
    }
}
