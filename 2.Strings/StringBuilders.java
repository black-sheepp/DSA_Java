import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");


        // Appending and modifying
        stringBuilder.append(" World");
        System.out.println("After appending: " + stringBuilder);

        // Inserting
        stringBuilder.insert(5, ", Java");
        System.out.println("After inserting: " + stringBuilder);

        // Deleting
        stringBuilder.delete(5, 11);
        System.out.println("After deleting: " + stringBuilder);

        // Reversing
        stringBuilder.reverse();
        System.out.println("After reversing: " + stringBuilder);

        // Converting to String
        String str = stringBuilder.toString();
        System.out.println("Converted to String: " + str);

        // Creating a StringBuilder from a String
        StringBuilder stringBuilder2 = new StringBuilder(str);
        System.out.println("Created from String: " + stringBuilder2);
        stringBuilder2.reverse();
        System.out.println("After reversing: " + stringBuilder2);
        
    }
}
