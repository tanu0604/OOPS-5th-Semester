import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {33,52,12,5,10};
        selectionSort(arr);
        System.out.println("After Selection Sort array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
//Output
//After Selection Sort array: [5, 10, 12, 33, 52]
