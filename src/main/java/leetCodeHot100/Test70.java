package leetCodeHot100;

/*
爬楼梯最小代价
 */
public class Test70 {
    public static void main(String[] args) {
        climbStairs(3);
    }

    private static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }

}
