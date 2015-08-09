package LeetCode;

import common.ListNode;

/**
 * Created by guangyw on 8/8/15.
 */
public class ReverseLinkedList {
    public ListNode reverseListRecursive(ListNode head) {
//        ListNode dummy = new ListNode(-1);
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode reverseListIterative(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        ListNode next = null;
        int pos = 1;
        while(pos < m && cur != null) {
            pre = cur;
            cur = cur.next;
            pos++;
        }
        while(pos < n && cur != null) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
            pos++;
        }
        return dummy.next;
    }
}
