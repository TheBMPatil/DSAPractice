package Arrays;

public class SelectionSort {
    public int[] selectSort(int[] arr, char order, int size) {
        System.out.println("Inside Selection Sort");
        return switch (order) {
            case 'A' -> ascendingSort(arr, size);
            case 'D' -> descendingSort(arr, size);
            default -> {
                System.out.println("Invalid Order");
                yield arr;
            }
        };

    }

    int[] ascendingSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                {
                    arr[i] = arr[i] + arr[minIndex];
                    arr[minIndex] = arr[i] - arr[minIndex];
                    arr[i] = arr[i] - arr[minIndex];
                }
            }
        }
        return arr;


    }

    int[] descendingSort(int[] arr, int size) {
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (arr[j] > arr[i]) {
//                    arr[i] = arr[i] + arr[j];
//                    arr[j] = arr[i] - arr[j];
//                    arr[i] = arr[i] - arr[j];
//                }
//            }
//        }
        for (int i = 0; i < size; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[i]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                {
                    arr[i] = arr[i] + arr[maxIndex];
                    arr[maxIndex] = arr[i] - arr[maxIndex];
                    arr[i] = arr[i] - arr[maxIndex];
                }
            }
        }
        return arr;
    }

}
