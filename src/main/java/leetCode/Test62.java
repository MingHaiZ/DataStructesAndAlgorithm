package leetCode;

/**
 * 不同路径
 */
public class Test62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    private static int uniquePaths(int m, int n) {
//        确认dp含义
        int[][] dp = new int[m][n];
//        分析完推导公式 dp[i][j] = dp[i-1][j](上方)+dp[i][j-1](左方)
//        初始化边缘
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
