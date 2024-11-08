package SortingAlgos;

import java.util.Arrays;

public class MergeSortWithExtraArray {
    public static void main(String[] args) {
        int arr[] = {96, 12, 5, 80, 18};
        System.out.println("Original");
        displayArray(arr);


        System.out.println("After Sort :");
        displayArray(mergeSort(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;


        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] > second[j]) {
                merged[k++] = second[j++];
            } else {
                merged[k++] = first[i++];
            }
        }

        while (i < first.length) {
            merged[k++] = first[i++];
        }
        while (j < second.length) {
            merged[k++] = second[j++];
        }


        return merged;
    }

    static void displayArray(int[] arr) {
        System.out.println("Array : ");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }

}


