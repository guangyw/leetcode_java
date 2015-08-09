package common;

/**
 * Created by guangyw on 8/8/15.
 */
public class LinkedList {

    public static ListNode BuildList(int[] vals) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        for(int i =0; i < vals.length; i++) {
            node.next = new ListNode(vals[i]);
            node = node.next;
        }
        return dummy.next;
    }
}
