package leetCodeHot100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 记录到数组然后双指针
 * 链表回文
 */
public class Test234 {
    public static void main(String[] args) {

    }

    private static boolean isPalindrome(ListNode head) {
        List<Integer> records = new ArrayList<>();
        while (head != null) {
            records.add(head.val);
            head = head.next;
        }
        int left = 0, right = records.size() - 1;
        while (left < right) {
            if (!records.get(left).equals(records.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    private class ListNode {
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
}
