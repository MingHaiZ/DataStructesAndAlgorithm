/*
 * @lc app=leetcode.cn id=226 lang=csharp
 *
 * [226] 翻转二叉树
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
    public TreeNode InvertTree(TreeNode root)
    {
        Queue<TreeNode> temp = new Queue<TreeNode>();
        if (root == null)
        {
            return null;
        }
        temp.Enqueue(root);
        while (temp.Count > 0)
        {
            int size = temp.Count;
            for (int i = 0; i < size; i++)
            {
                TreeNode node = temp.Dequeue();
                TreeNode tempnode = node.left;
                node.left = node.right;
                node.right = tempnode;
                if (node.left != null) temp.Enqueue(node.left);
                if (node.right != null) temp.Enqueue(node.right);
            }
        }
        return root;
    }
}
// @lc code=end

