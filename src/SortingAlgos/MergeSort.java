package SortingAlgos;

public class MergeSort {
    public static void main(String[] args) {
//        int size = 5;
        int arr[] = {7, 3, 5, 4};
        System.out.println("Original");
        displayArray(arr);

        divide(arr, 0, arr.length - 1);

        System.out.println("After Sort :");
        displayArray(arr);
    }


    static void merge(int arr[], int start, int mid, int end) {
        System.out.println("\n\n#########Inside Merge");
        int k = 0, i = start, j = mid + 1;
        int tempSize = (end - start) + 1;
        int[] merged = new int[tempSize];
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            merged[k] = arr[j];
            k++;
            j++;
        }
        int s = 0;
        // for (int i = start, s = 0; i < k; i++, s++) ///Thodasa barabr op :After Sort :Array : 12  20      18      25      85
        for (i = start; s < k; i++, s++) {
            arr[i] = merged[s];
            System.out.println("\n$ :  " + arr[i]);
        }
    }

    static void divide(int arr[], int start, int end) {
        System.out.println("\n##########$$$$$..Inside Divide");
        if (start == end) {
            return;
        }

        int mid = (start + end) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    static void displayArray(int[] arr) {
        System.out.println("Array : ");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }

}
