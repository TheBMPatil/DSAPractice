package Patterns;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            int n;
            System.out.println("Enter No of Rows :");
            n = sc.nextInt();
//            starRectangle(n);
//            pattern2(n);
//            pattern6(n);
//            starPyramid(n);
//            pattern8(n);
//            pattern9(n);
//            pattern10(n);
//            pattern11(n);
//            pattern12(n);
//            pattern13(n);
//            pattern14(n);
//            pattern15(n);
//            pattern16(n);
//            pattern17(n);
//            SIR(n);
//            sapSidi();
//            sIR(n);
//            patternStarDoller(n);
            hollowTriangle(n);


        }

    }

    static void starRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void numPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void starPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
//            space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            //Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
//            space
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            //Stars
//            for (int j = i; j < 2 * n - i - 1; j++) {
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    static void pattern10(int n) {
        //My solution
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = n; i > 0; i--) {
//
//            for (int j = i; j > 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Strivers
        for (int i = 1; i <= (2 * n) - 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            //nums
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            //spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            //nums
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            space -= 2;
        }
    }

    static void pattern13(int n) {
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                if (ch == ('Z' + 1)) ch = 'A';
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = n - i; j > 0; j--) {
                if (ch == ('Z' + 1)) ch = 'A';
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (ch == ('Z' + 1)) ch = 'A';
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }

    static void pattern162(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                if (ch == ('Z' + 1)) ch = 'A';
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    static void pattern17(int n) {
        //TODO: Complete Logic....
        //Current out put :
//        Enter No of Rows :
//        5
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            int numOfChars = 2 * i + 1;
            char ch = 'A';
            for (int j = 0; j < numOfChars; j++) {
                System.out.print(ch);
                if (j < numOfChars / 2) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }


//    static void SIR(int n) {
////        int cnt = 4;
////        int s;
////        for (int i = 0; i < (2 * n) - 1; i++) {
////            for (int j = 0; j < (2 * n) - 1; j++) {
////                s = i > j ? i : j;
////                System.out.print(n - s + " ");
////            }
////            System.out.println("  ");
////        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//            }
//        }
//    }

//    100 99 98 97 96 95 94 93 92 91
//    81 82 83 84 85 86 87 88 89 90
    //80 79 78 77 76 75 74 73 72 71
    //61 62 63 64 65 66 67 68 69 70

    static void sapSidi() {
        int cnt = 100;
        for (int i = 10; i > 0; i--) {
//            if (i % 2 == 0)
            int k = cnt;
            if (i % 2 == 0) {
                k = cnt;
                for (int j = 0; j < 10; j++)
                    System.out.print(k - j + "  ");
            } else {
                k = cnt - 10;
                for (int j = 1; j <= 10; j++)
                    System.out.print(k + j + "  ");

            }


//            else if (i % 2 != 0) {
//                for (int j = 10; j > 0; j--)
//                    System.out.print(cnt2 - j + "  ");
//            }
//            cnt2 = cnt2 - 10;
            cnt = cnt - 10;

            System.out.println();
        }

    }

    /*
       1 2 3 4 5 6 7
    1  4 4 4 4 4 4 4
    2  4 3 3 3 3 3 4
    3  4 3 2 2 2 3 4
    4  4 3 2 1 2 3 4
    5  4 3 2 2 2 3 4
    6  4 3 3 3 3 3 4
    7  4 4 4 4 4 4 4


    * */
    static void sIR(int n) {
        int cnt = n;

        n = (n * 2) - 2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atIndex = cnt - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atIndex + " ");
            }
            System.out.println();
        }
    }

    //    *****$
//    ****$$
//    ***$$$
//    **$$$$
//    *$$$$$
//    $$$$$$
    static void patternStarDoller(int n) {
        for (int i = 0; i <= n; i++) {

//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = n; j >= n - i; j--) {
//                System.out.print("$ ");
//            }


            for (int j = 0; j <= n; j++) {
                if (j >= n - i) {
                    System.out.print("$ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }


    static void hollowTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}


