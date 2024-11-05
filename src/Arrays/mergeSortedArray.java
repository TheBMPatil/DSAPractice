package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class mergeSortedArray {


    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1, size2;
        System.out.println("Enter Size for First Array : ");
        size1 = sc.nextInt();
        System.out.println("Enter Size for Second Array : ");
        size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        int[] arr3 = {23, 12, 43, 564, 21, 56};
        int[] arr4 = {3, 412, 343, 24, 11, 96};

        int[] result = mergeTwoArrays(arr3, arr4);
        displayArray(result);
    }


//    static int[] mergeTwoArrays(int arr1[], int arr2[]) {
//        int[] result = new int[(arr1.length + arr2.length)];
//        SelectionSort selectionSort = new SelectionSort();
//        arr1 = selectionSort.selectSort(arr1, 'A', arr1.length);
//        arr2 = selectionSort.selectSort(arr2, 'A', arr2.length);
//        int a1 = 0, a2 = 0;
//        int comparator = arr1.length > arr2.length ? arr1.length : arr2.length;
//        for (int i = 0; i < comparator; i++) {
//            if (a1 >= arr1.length) {
//                result[i] = arr2[a2++];
//            } else if (a2 > arr2.length) {
//                result[i] = arr1[a1++];
//            } else if (a1 < arr1.length && a2 < arr2.length) {
//                if (arr1[a1] < arr2[a2]) {
//                    result[i] = arr1[a1];
//                    a1++;
//                } else {
//                    result[i] = arr2[a2];
//                    a2++;
//                }
//            }
//        }
//
//        return result;
//    }


    static int[] mergeTwoArrays(int arr1[], int arr2[]) {
        // Sort both arrays in ascending order
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] result = new int[arr1.length + arr2.length];
        int a1 = 0, a2 = 0;

        // Using a for loop to fill up the result array
        for (int i = 0; i < result.length; i++) {
            if (a1 < arr1.length && (a2 >= arr2.length || arr1[a1] < arr2[a2])) {
                result[i] = arr1[a1++];
            } else {
                result[i] = arr2[a2++];
            }
        }

        return result;
    }


    public void storeArray(int arr[]) {
        int size = arr.length;
        System.out.println("Enter " + size + " elements of array:");
        for (int i = 0; i < size; i++) {
            while (true) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                    break; // valid integer, exit the loop
                } else {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    sc.next(); // Clear invalid input
                }
            }
        }
    }

    static void displayArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

}
