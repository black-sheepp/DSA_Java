import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input Array Size: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Array at index " + i + ": ");
            arr[i] = s.nextInt();
        }

        System.out.print("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
