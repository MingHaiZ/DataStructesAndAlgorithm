package leetCode;

public class Test53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4}));
    }

    /**
     * 五步分析法
     * @param nums
     * @return
     */
    private static int maxSubArray(int[] nums) {
//        1.dp数组含义为以i结尾的子序列最大和
//        2.推导公式为上一个结尾的最大子序列和加上当前数与当前数进行对比取最大,如果自己为最大则推翻前面
//        3.初始化第一位固定为nums[0],自己和自己子序列的最大和就是自己
//        4.遍历顺序从前向后
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = nums[0];
        if (nums.length == 1) {
            return dp[0];
        }
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if (result < dp[i]) {
                result = dp[i];
            }
        }
        return result;
    }
}
