package LeetCode;

import common.ListNode;

/**
 * Created by guangyw on 8/9/15.
 */
public class MergeTwoSortedList {
    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        ListNode p1 = l1, p2 = l2;
        while(p1 != null || p2 != null) {
            if (p1 == null) {
                cur.next = p2;
                break;
            }
            if (p2 == null) {
                cur.next = p1;
                break;
            }
            if (p1.val < p2.val) {
                cur.next = p1;
                p1 = p1.next;
            } else {
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}