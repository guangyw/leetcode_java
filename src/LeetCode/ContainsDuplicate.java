package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by guangyw on 8/4/15.
 */
public class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(nums[i])) {
                if (i - m.get(nums[i]) <= k) {
                    return true;
                }
            }
            m.put(nums[i], i);
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        Set s = new HashSet();
        for (int n : nums) {
            if (s.contains(n)) {
                return true;
            }
            s.add(n);
        }
        return false;
    }
}
