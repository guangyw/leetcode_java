package common;

import java.util.List;

/**
 * Created by guangyw on 8/8/15.
 */
public class ListNode implements Comparable<ListNode>{
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode node = this;
        // set a limit in case loop
        int n = 10;
        while (node != null && n > 0) {
            sb.append(node.val);
            sb.append(';');
            node = node.next;
            n--;
        }
        return sb.toString();
    }

    @Override
    public int compareTo(ListNode o) {
        return val - o.val;
    }
}
