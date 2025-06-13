package leetCode;

public class Test112 {

    private boolean hasPathSum(TreeNode root, int targetSum) {
        return inorder(root, targetSum);
    }

    private boolean inorder(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum -= root.val;
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        boolean left = inorder(root.left, targetSum);
        if (left) {
            return true;
        }
        return inorder(root.right, targetSum);
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
