package leetCodeHot100;

import java.util.List;

public class Test92 {

    private ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode p0 = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            p0 = p0.next;
        }
        ListNode prev = null;
        ListNode cur = p0.next;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        p0.next.next = cur;
        p0.next = prev;
        return dummyNode.next;
    }

    public class ListNode {
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
