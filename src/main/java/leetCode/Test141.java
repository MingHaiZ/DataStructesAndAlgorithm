package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Test141 {
    private boolean hasCycle(ListNode head) {
        Set<ListNode> records = new HashSet<>();
        while (head != null) {
            if (records.contains(head)) {
                return true;
            }
            records.add(head);
            head = head.next;

        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
