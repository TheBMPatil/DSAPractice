package SortingAlgos;

import Arrays.ArrayMath;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {


        int[] arr = {};
        System.out.println("Before QuickSort");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, 5);
        System.out.println("After QuickSort");
        System.out.println(Arrays.toString(arr));

    }


    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot_index = partition(arr, start, end);
            quickSort(arr, start, pivot_index - 1);
            quickSort(arr, pivot_index + 1, end);
        }

    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int index = start - 1;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                index++;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        index++;
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
        return index;
    }
}
