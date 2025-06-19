package leetCode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 * <p>
 * <p>
 * Related Topics 数组 矩阵 模拟 👍 1934 👎 0
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right = matrix[0].length, top = 0, bottom = matrix.length;
        List<Integer> res = new ArrayList<>();
        while (left < right && top < bottom) {
            for (int i = left; i < right; i++) {
                res.add(matrix[top][i]);
            }
            ++top;
            if (top >= bottom) {
                break;
            }
            for (int j = top; j < bottom; j++) {
                res.add(matrix[j][right - 1]);
            }
            --right;
            if (left >= right) {
                break;
            }
            for (int k = right - 1; k >= left; --k) {
                res.add(matrix[bottom - 1][k]);
            }
            --bottom;
            if (top >= bottom) {
                break;
            }
            for (int l = bottom - 1; l >= top; --l) {
                res.add(matrix[l][left]);
            }
            ++left;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
