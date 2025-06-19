package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Test23 {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }
        List<ListNode> res = new ArrayList<>();
        for (ListNode list : lists) {
            res.add(list);
        }
        while (res.size() > 1) {
            List<ListNode> tempList = new ArrayList<>();
            for (int i = 0; i < res.size(); i += 2) {
                ListNode p1 = res.get(i);
                ListNode p2 = null;
                if (i + 1 < res.size()) {
                    p2 = res.get(i + 1);
                }
                tempList.add(mergeTwoList(p1, p2));
            }
            res = tempList;
        }

        return res.getFirst();
    }

    public ListNode mergeTwoList(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode cur = dummy, p1 = list1, p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                cur.next = p2;
                p2 = p2.next;
            } else {
                cur.next = p1;
                p1 = p1.next;
            }
            cur = cur.next;
        }

        if (p1 != null) {
            cur.next = p1;
        }
        if (p2 != null) {
            cur.next = p2;
        }
        return dummy.next;

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
