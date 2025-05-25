package leetCodeHot100;

public class Test543 {
    private int max;

    private int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = 0, right = 0;
        left = dfs(node.left) + 1;
        right = dfs(node.right) + 1;
        max = Math.max(left + right, max);
        return Math.max(left, right);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
