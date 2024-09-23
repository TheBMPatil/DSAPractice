package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = -1; // Initialize ch to an invalid value
        char AD;
        ArrayBasic ab = new ArrayBasic();
        do {
            try {
                System.out.println("Enter Your choice");
                System.out.println("1) Store The Array \t 2) Display The array \t 3) Search Element in Array \n 4) Sort The array \t5) Selection Sort \t6) Insertion sort \n0) Exit");

                // Check if input is an integer
                if (sc.hasNextInt()) {
                    ch = sc.nextInt();
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.next(); // Clear the invalid input
                    continue; // Go back to start of loop to ask for input again
                }

                switch (ch) {
                    case 1:
                        ab.storeArray();
                        break;
                    case 2:
                        ab.displayArray();
                        break;
                    case 3:
                        System.out.println("Enter Element You want to Search");
                        if (sc.hasNextInt()) {
                            int key = sc.nextInt();
                            int res = ab.seqSearch(key);
                            if (res == -1) {
                                System.out.println("Element Not Found");
                            } else {
                                System.out.println("Element Found at index :" + (res + 1));
                            }
                        } else {
                            System.out.println("Invalid input! Please enter a valid integer.");
                            sc.next(); // Clear invalid input
                        }
                        break;
                    case 4:
                        System.out.println("To BubbleSort by \nascending order enter A \nFor Descending Enter D");
                        AD = sc.next().charAt(0);
                        BubbleSort bbl = new BubbleSort(ab.arr, AD, ab.size);
                        System.out.println("Sorted Array : ");
                        ab.displayArray();

                        break;
                    case 5:
                        System.out.println("To SelectionSort by \nascending order enter A \nFor Descending Enter D");
                        AD = sc.next().charAt(0);

                        SelectionSort slsrt = new SelectionSort();

                        ab.arr = slsrt.selectSort(ab.arr, AD, ab.size);
                        System.out.println("Sorted Array : ");
                        ab.displayArray();
                        break;
                    case 6:
                        System.out.println("To Insertion by \nascending order enter A \nFor Descending Enter D");
                        AD = sc.next().charAt(0);

                        InsertionSort insrt = new InsertionSort();

                        ab.arr = insrt.insertSort(ab.arr, AD, ab.size);
                        System.out.println("Sorted Array : ");
                        ab.displayArray();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose between 0-4.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input
            }
        } while (ch != 0);
    }
}
