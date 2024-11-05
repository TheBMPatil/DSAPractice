package Arrays;

import java.util.Scanner;

class ArrayBasic {
    Scanner sc = new Scanner(System.in);
    int[] arr;
    int size;

    public ArrayBasic(int size) {
        arr = new int[size];
    }

    public ArrayBasic() {
        System.out.println("Enter The Size for array");
        while (true) {
            if (sc.hasNextInt()) {
                size = sc.nextInt();
                break; // valid integer, exit the loop
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); // Clear invalid input
            }
        }
        arr = new int[size];
    }

    public void storeArray() {
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

    public void displayArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public int seqSearch(int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int length() {
        return size;
    }
}