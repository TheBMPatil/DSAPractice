package Recursion;

public class fibonacciOfN {
    public static void main(String[] args) {
        System.out.println("Fibonacci :" + fibo(6));
     }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
