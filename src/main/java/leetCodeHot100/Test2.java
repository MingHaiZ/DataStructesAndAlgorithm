package leetCodeHot100;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return t(l1, l2, 0);
    }

    private ListNode t(ListNode l1, ListNode l2, int add) {

        if (l1 == null && l2 == null) {
            return add > 0 ? new ListNode(add) : null;
        }

        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;

        int cur = val1 + val2 + add;
        int i = cur % 10;
        int k = cur / 10;
        ListNode listNode = new ListNode(i);
        l1 = l1 != null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
        listNode.next = t(l1, l2, k);
        return listNode;
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
