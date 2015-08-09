package LeetCode;

//this problem could be solved naturally with adapted quicksort

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by guangyw on 8/9/15.
 */
public class FindKthElement {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        for (int num : nums) {
            pq.offer(num);
        }
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        return pq.peek();
    }
}
