/*
 * @lc app=leetcode.cn id=102 lang=csharp
 *
 * [102] 二叉树的层序遍历
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
    public IList<IList<int>> LevelOrder(TreeNode root)
    {

        IList<IList<int>> res = new List<IList<int>>();
        if (root == null)
        {
            return res;
        }
        Queue<TreeNode> que = new Queue<TreeNode>();
        que.Enqueue(root);
        while (que.Count > 0)
        {
            int size = que.Count;
            List<int> temp = new List<int>();
            for (int i = 0; i < size; i++)
            {
                TreeNode node = que.Dequeue();
                if (node.left != null) que.Enqueue(node.left);
                if (node.right != null) que.Enqueue(node.right);
                temp.Add(node.val);
            }
            res.Add(temp);
        }
        return res;
    }
}
// @lc code=end

