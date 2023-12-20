import java.util.Scanner;

public class InputArray {
    public static void printArray(int [] arr){
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int [] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Input Array Size: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Array at index " + i + ": ");
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int sumOfArraysElement(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        printArray(arr);
        System.out.println("Sum of Arrays Element: " + sumOfArraysElement(arr));
    }
}
