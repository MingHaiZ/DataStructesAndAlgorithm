package leetCode;

public class Test1721 {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode p1 = dummy, p2 = dummy;
        int index = 0;
        ListNode node = new ListNode();
        for (int i = 0; i <= k; i++) {
            if (index == k) {
                node = p2;
            }
            p2 = p2.next;
            index++;

        }
        while (p2 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        int temp = p1.next.val;
        p1.next.val = node.val;
        node.val = temp;
        return dummy.next;

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
