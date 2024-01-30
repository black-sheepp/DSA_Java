import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        // Declare and initialize strings
        String str = "Hello World!";
        String str2 = "Welcome to Java";
        String str3 = "hello world!";

        // Print the original string
        System.out.println("Original String: " + str);

        // startsWith method examples
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Starts with 'Hello' at index 0: " + str.startsWith("Hello", 0));
        System.out.println("Starts with 'Hello' at index 1: " + str.startsWith("Hello", 1));

        // lowercase and uppercase methods
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // trim method example
        String str4 = "   Hello World!   ";
        System.out.println("With whitespaces: " + str4);
        System.out.println("Without whitespaces: " + str4.trim());

        // replace method example
        System.out.println("With spaces: " + str4);
        System.out.println("Without spaces: " + str4.replace(" ", ""));

        // split method example
        String str5 = "Hello,World,!";
        System.out.println("Original String: " + str5);
        String[] strArr = str5.split(",");
        System.out.println("String array: " + Arrays.toString(strArr));

        // join method example
        System.out.println("String array: " + Arrays.toString(strArr));
        System.out.println("Joined String: " + String.join(",", strArr));

        // substring method example
        System.out.println("Original String: " + str);
        System.out.println("Substring from index 4 to 8: " + str.substring(4, 8));

        // indexOf method examples
        System.out.println("Original String: " + str);
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Index of 'o' after index 5: " + str.indexOf('o', 5));
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // compareTo method examples
        System.out.println("CompareTo with str2: " + str.compareTo(str2));
        System.out.println("CompareTo with str3: " + str.compareTo(str3));

        // equals method example
        System.out.println("Equals with str2: " + str.equals(str2));

        // equalsIgnoreCase method example
        System.out.println("EqualsIgnoreCase with str3: " + str.equalsIgnoreCase(str3));

        // length method example
        System.out.println("Original String: " + str);
        System.out.println("Length of the string: " + str.length());

        // charAt method example
        System.out.println("Original String: " + str);
        System.out.println("Character at index 4: " + str.charAt(4));

        // getChars method example
        System.out.println("Original String: " + str);
        char[] charArr = new char[5];
        str.getChars(0, 5, charArr, 0);
        System.out.println("Character array: " + Arrays.toString(charArr));

        // toCharArray method example
        System.out.println("Original String: " + str);
        char[] charArr2 = str.toCharArray();
        System.out.println("Character array: " + Arrays.toString(charArr2));

        // strip method example
        String str6 = "   Hello World!   ";
        System.out.println("Original String: " + str6);
        System.out.println("Stripped String: " + str6.strip());
    }
}
