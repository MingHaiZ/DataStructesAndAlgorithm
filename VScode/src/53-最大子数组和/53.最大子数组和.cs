/*
 * @lc app=leetcode.cn id=53 lang=csharp
 *
 * [53] 最大子数组和
 */

// @lc code=start
using System.Runtime.Intrinsics.Arm;

public class Solution
{
    public int MaxSubArray(int[] nums)
    {
        int[] dp = new int[nums.Length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.Length; i++)
        {
            dp[i] = Math.Max(dp[i - 1] + nums[i], nums[i]);
            max = Math.Max(max,dp[i]);
        }
        return max;
    }
}
// @lc code=end

