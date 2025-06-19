package leetCode.editor.cn;

/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [], val = 1
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 列表中的节点数目在范围 [0, 10⁴] 内
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 * <p>
 * <p>
 * Related Topics 递归 链表 👍 1536 👎 0
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode p = dummy;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val != val) {
                dummy.next = cur;
                dummy = dummy.next;
            }
            cur = cur.next;
        }
        dummy.next = null;
        return p.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
