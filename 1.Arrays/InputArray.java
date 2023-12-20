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

    public static int largestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int linearSearchArray(int[] arr){
        int index = -1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element to search in Array : ");
        int ele = s.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                index = i;
                return index;
            }
        }
        return index;
    }

    public static boolean isElementExist(int[] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element to find in array: ");
        int element = s.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(element == arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        printArray(arr);
        System.out.println("Sum of Arrays Element: " + sumOfArraysElement(arr));
        System.out.println("Largest Element in Array : " + largestElement(arr));
        System.out.println("Linear Search in Array : " + linearSearchArray(arr));
        System.out.println("Find Element in Array : " + isElementExist(arr));
    }
}
