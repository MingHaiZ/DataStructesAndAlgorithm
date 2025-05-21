package leetCodeHot100;

public class Test343 {
    public static void main(String[] args) {

        System.out.println(integerBreak(10));

    }

    private static int integerBreak(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i/2; j++) {
                int i1 = Math.max(j * (i - j), j * dp[i - j]);
                dp[i] = Math.max(i1, dp[i]);
            }
        }
        return dp[n];
    }
}
