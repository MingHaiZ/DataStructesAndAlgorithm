/*
 * @lc app=leetcode.cn id=543 lang=csharp
 *
 * [543] 二叉树的直径
 */
// 从左到右的高度之和
// 深度搜索 dfs
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
    private int max;
    public int DiameterOfBinaryTree(TreeNode root)
    {
        dfs(root);
        return max;
    }
    public int dfs(TreeNode node)
    {
        if (node == null)
        {
            return -1;
        }
        int left = 0, right = 0;
        left = dfs(node.left) + 1;
        right = dfs(node.right) + 1;
        max = Math.Max(left + right, max);
        return Math.Max(left, right);
    }
}
// @lc code=end

