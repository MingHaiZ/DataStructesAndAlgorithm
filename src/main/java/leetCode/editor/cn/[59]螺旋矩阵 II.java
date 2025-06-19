package leetCode.editor.cn;

/**
 * 给你一个正整数 n ，生成一个包含 1 到 n² 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 1
 * 输出：[[1]]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= n <= 20
 * <p>
 * <p>
 * Related Topics 数组 矩阵 模拟 👍 1462 👎 0
 */

class t59 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateMatrix(3);
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int cur = 1;
        int[][] res = new int[n][n];
        int left = 0, right = n-1, top = 0, bottom = n-1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                res[top][i] = cur++;
            }
            top++;
            if (top > bottom) {
                break;
            }
            for (int j = top; j <= bottom; j++) {
                res[j][right] = cur++;
            }
            right--;
            if (left > right) {
                break;
            }
            for (int k = right; k >= left; k--) {
                res[bottom][k] = cur++;
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            for (int l = bottom; l >= top; l--) {
                res[l][left] = cur++;
            }
            left++;

        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
