import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 10, 20, 15};

        for (int j = 0; j < arr.length; j++) {
            int minIndex = j;
            for (int i = j; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
            /*arr[j] = arr[j] ^ arr[minIndex];
            arr[minIndex] = arr[j] ^ arr[minIndex];
            arr[j] = arr[j] ^ arr[minIndex];*/
        }

        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
