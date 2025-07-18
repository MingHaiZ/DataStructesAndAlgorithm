/*
 * @lc app=leetcode.cn id=104 lang=csharp
 *
 * [104] 二叉树的最大深度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution
{
    public int MaxDepth(TreeNode root)
    {
        int maxLeftDepth, maxRightDepth;
        if (root == null)
        {
            return 0;
        }
        else
        {
            maxLeftDepth = MaxDepth(root.left);
            maxRightDepth = MaxDepth(root.right);
        }
        return Math.Max(maxLeftDepth, maxRightDepth)+1;
    }
}
// @lc code=end

