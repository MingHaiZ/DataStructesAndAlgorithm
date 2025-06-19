package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Test876 {

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        List<ListNode> res = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            res.add(cur);
            cur = cur.next;
        }
        int mid = (int) Math.ceil(res.size() / 2);
        return res.get(mid);
    }

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
}
