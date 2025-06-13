package leetCode;

/**
 * 打家劫舍
 */
public class Test198 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2}));
    }

    private static int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}
