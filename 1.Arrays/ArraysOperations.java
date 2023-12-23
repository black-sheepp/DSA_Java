import java.util.Arrays;
import java.util.Scanner;

public class ArraysOperations {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of an array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element at index : " + i + " : ");
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void sortArray( int[] arr){
        Arrays.sort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }

    public static void printArray(int[] arr){
        System.out.println("Array of size " + arr.length + " : " + Arrays.toString(arr));
    }

    public static void printPair(int [] arr){
        int count = 0;
        System.out.print("Possible pairs in array:");
        for (int i = 0; i < arr.length; i++){
            for( int j = i+1; j < arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                count++;
            }
        }
        System.out.println("\nNo of possible pairs in array : " + count);
    }

    public static void main(String[] args) {
        // int arr[] = takeInput();
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        sortArray(arr);
        printPair(arr);
    }
}
