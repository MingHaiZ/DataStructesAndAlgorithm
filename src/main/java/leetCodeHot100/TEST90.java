package leetCodeHot100;

import java.util.Arrays;

public class TEST90 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{200,3,140,20,10}));
    }

    private static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robInternal(Arrays.copyOfRange(nums, 0, nums.length - 1)), robInternal(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private static int robInternal(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i-1]);
        }
        return dp[n - 1];

    }
}
