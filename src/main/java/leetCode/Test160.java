package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Test160 {

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> headASet = new HashSet<>();
        while (headA != null) {
            headASet.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (headASet.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}


