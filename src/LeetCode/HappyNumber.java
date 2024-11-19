package LeetCode;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(16));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSqr(slow);
            fast = findSqr(findSqr(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static int findSqr(int num) {

        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += (rem * rem);
            num /= 10;
        }
        return ans;
    }

}
