package Arrays;

public class InsertionSort {
    int[] insertSort(int[] arr, char AD, int size) {
        for (int i = 0; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }


        return arr;
    }

}
