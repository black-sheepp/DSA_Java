import java.util.*;

public class LinearSearch {
    // Dont get confisued with same function name for string and array linear
    // search, this is function overloading and JVM automatically call the funtion
    // accordingly with the passing parameter and arguements.

    // What is funtion overloading ?
    // Function overloading allows the definition of multiple functions with the
    // same name but different parameter types or numbers. The compiler determines
    // the correct function to call based on the provided arguments at compile time.
    // This feature enhances code readability and supports cleaner APIs by using a
    // single function name for related operations.

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
