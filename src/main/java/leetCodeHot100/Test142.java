package leetCodeHot100;

import java.util.HashSet;
import java.util.Set;

public class Test142 {
    private ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> records = new HashSet<>();
        while (pos != null) {
            if (records.contains(pos)) {
                return pos;
            } else {
                records.add(pos);
            }
            pos = pos.next;
        }
        return null;
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
