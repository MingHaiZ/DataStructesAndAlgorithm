/*
 * @lc app=leetcode.cn id=2 lang=csharp
 *
 * [2] 两数相加
 */

public class ListNode
{
    public int val;
    public ListNode next;
    public ListNode(int val = 0, ListNode next = null)
    {
        this.val = val;
        this.next = next;
    }
}
// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution
{
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode p1 = l1, p2 = l2, dummy = new ListNode(), cur = dummy;
        int lef = 0;
        while (p1 != null || p2 != null || lef != 0)
        {
            int res = lef;
            if (p1 != null)
            {
                res += p1.val;
                p1 = p1.next;
            }
            if (p2 != null)
            {
                res += p2.val;
                p2 = p2.next;
            }
            ListNode node = new ListNode();
            lef = res / 10;
            node.val = res % 10;
            cur.next = node;
            cur = cur.next;
        }
        return dummy.next;
    }
}
// @lc code=end

