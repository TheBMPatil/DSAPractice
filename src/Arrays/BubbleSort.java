package Arrays;

public class BubbleSort {
    public BubbleSort(int[] arr, char AD, int size) {

        int i;
        switch (AD) {
            case 'A':
                for (i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (arr[i] < arr[j]) {
                            int tmp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = tmp;
                        }
                    }
                }
                if (i == size) {
                    System.out.println("Array Sorted Successfully..!");
                } else {
                    System.out.println("Couldn't sort!");
                }
                break;
            case 'D':
                for (i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (arr[i] > arr[j]) {
                            int tmp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = tmp;
                        }
                    }
                }
                if (i == size) {
                    System.out.println("Array Sorted Successfully..!");
                } else {
                    System.out.println("Couldn't sort!");
                }
                break;
        }
    }
}
