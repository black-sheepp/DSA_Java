import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,4,7,4,5,9,1,2,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
