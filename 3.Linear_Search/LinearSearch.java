import java.util.*;

public class LinearSearch {
    /**
     * This code snippet demonstrates the concept of function overloading in Java.
     * It provides two implementations of linear search, one for integer arrays and
     * another for string arrays. The linearSearch method takes an array and a
     * target
     * value as parameters and returns the index of the target value if found, or -1
     * if not found. The main method creates an integer array and a string array,
     * and
     * calls the linearSearch method with different target values to demonstrate its
     * usage. This code snippet serves as a basic example of how to implement and
     * use
     * function overloading in Java.
     */

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        String str[] = { "mango", "apple", "banana", "strawberry", "pineapple", "orange", "samsung", "blackberry" };
        System.out.println("Linear Search in Array: " + linearSearch(arr, 7));
        System.out.println("Linear Search in String: " + linearSearch(str, "pineapple"));
    }
}
