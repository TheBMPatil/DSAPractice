package mathamaticalProblems;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Nums : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("GCD is : " + findGCD(n1, n2));
        System.out.println("EGCD is : " + euclideanGCD(n1, n2));

    }

    //Linear Method
    static int findGCD(int n1, int n2) {
        int gcd = 1, mini = min(n1, n2);
        for (int i = 1; i <= mini; i++)
            if (n1 % i == 0 && n2 % i == 0) gcd = i;
        return gcd;
    }

    static int min(int n1, int n2) {
        if (n1 < n2) return n1;
        else return n2;
    }

    //Euclidian
    static int euclideanGCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        if (n1 == 0) return n2;
        else return n1;
    }

}