package leetCode;

/**
 * 两两交换节点
 */
public class Test24 {

    private ListNode swapPairs(ListNode head) {

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while (cur.next != null && cur.next.next != null) {
            ListNode l1 = cur.next;
            ListNode l2 = cur.next.next;
            cur.next = l2;
            l1.next = l2.next;
            l2.next = l1;
            cur = cur.next.next;
        }
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
