/*
 * @lc app=leetcode.cn id=234 lang=csharp
 *
 * [234] 回文链表
 */

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
    public bool IsPalindrome(ListNode head)
    {
        List<int> record = new List<int>();
        ListNode cur = head;
        while (cur != null)
        {
            record.Add(cur.val);
            cur = cur.next;
        }
        if (record.Count ==0)
        {
            return false;
        }
        int left = 0, right = record.Count - 1;
        while (left < right)
        {
            if (record[left] != record[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

