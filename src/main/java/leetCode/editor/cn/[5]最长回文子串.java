package leetCode.editor.cn;

/**
 * 给你一个字符串 s，找到 s 中最长的 回文 子串。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "cbbd"
 * 输出："bb"
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 * <p>
 * <p>
 * Related Topics 双指针 字符串 动态规划 👍 7728 👎 0
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        int maxStart = 0;
        int left, right;
        for (int i = 0; i < s.length(); i++) {
//            bab
            left = i;
            right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    maxStart = left;
                }
                left--;
                right++;
            }

//            baab
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    maxStart = left;
                }
                left--;
                right++;
            }
        }
        return s.substring(maxStart, maxStart + maxLen);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
