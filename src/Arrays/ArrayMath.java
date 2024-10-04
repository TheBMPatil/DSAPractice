package Arrays;

public class ArrayMath {
    SelectionSort selectionSort = new SelectionSort();

    //Find Max
    int findMax(int[] Arr) {
//        int max = Arr[0];
//        for (int i = 1; i < Arr.length; i++) {
//            if (Arr[i] > max) {
//                max = Arr[i];
//            }
//        }
//        return max;
        selectionSort.selectSort(Arr, 'D', Arr.length);
        return Arr[0];
    }

    //Second Max
    int secondMax(int[] Arr) {
        selectionSort.selectSort(Arr, 'D', Arr.length);
        return Arr[1];
    }

    //Find Min
    int findMin(int[] Arr) {
        selectionSort.selectSort(Arr, 'A', Arr.length);
        return Arr[0];
    }

    //second Min
    int secondMin(int[] Arr) {
        selectionSort.selectSort(Arr, 'A', Arr.length);
        return Arr[1];
    }

    //Rotating array
    int[] rotateArray(int[] Arr, char direction, int noOfShift) {
        if (direction == 'L') {
            for (int j = 0; j < noOfShift; j++) {
                for (int i = 0; i < Arr.length - 1; i++) {
                    int present = Arr[0];
                    int temp = Arr[i];
                    Arr[i] = Arr[i + 1];
                    Arr[i + 1] = temp;
                }
            }
        } else if (direction == 'R') {
            for (int j = 0; j < noOfShift; j++) {
                for (int i = Arr.length - 2; i >= 0; i--) {
                    int present = Arr[Arr.length - 1];
                    int temp = Arr[i];
                    Arr[i] = Arr[i + 1];
                    Arr[i + 1] = temp;
                }
            }
        } else {
            System.out.println("Invalid Choice..");
        }
        return Arr;
    }


    //Merge array
}
