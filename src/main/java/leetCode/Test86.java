package leetCode;

import java.util.List;

/**
 * 分隔链表
 */
public class Test86 {

    public ListNode partition(ListNode head, int x) {

//        小于x的
        ListNode dummy1 = new ListNode();
        ListNode p1 = dummy1;
//        大于x的
        ListNode dummy2 = new ListNode();
        ListNode p2 = dummy2;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                p1.next = cur;
                p1 = p1.next;
            } else {
                p2.next = cur;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        p1.next = dummy2.next;
        /*
          原链表: 1 -> 4 -> 3 -> 2 -> 5 -> 2 (x=3)
          分区后:
          - <x 的子链表: 1 -> 2 -> 2
          - >=x 的子链表: 4 -> 3 -> 5
          5 -> 2 -> 4 -> 3 -> 5 -> 2 .....
          5 是 >=x 的子链表的最后一个节点，它的 next 原本指向 2（因为原链表中 5 -> 2）。
          1 -> 2 -> 2 -> 4 -> 3 -> 5 -> 2 -> ...
         */
        p2.next = null;
        return dummy1.next;

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


