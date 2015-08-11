package LeetCode;

import java.util.TreeSet;

/**
 * Created by guangyanw on 8/11/15.
 */
public class ContainsDuplicates {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k == 0) return false;
        TreeSet<Integer> bst = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer floor = bst.floor(nums[i] + t);
            Integer ceil = bst.ceiling(nums[i] - t);
            if ((floor != null && floor >= nums[i]) || (ceil != null && ceil <= nums[i])) {
                return true;
            }
            if (i >= k) {
                bst.remove(nums[i -k]);
            }
            bst.add(nums[i]);
        }
        return false;
    }
}
