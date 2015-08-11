package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guangyw on 8/11/15.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int[] twoNum;
        for (int i = 0; i < nums.length - 2; i = inc(nums, i)) {
            int low = i + 1, high = nums.length -1;
            while (low < high) {
                int sum = nums[i] +nums[low] + nums[high];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low = inc(nums, low);
                    high = dec(nums, high);
                } else if (sum < 0) {
                    low = inc(nums, low);
                } else {
                    high = dec(nums, high);
                }
            }
        }
        return res;
    }

    public int inc(int[] nums, int low) {
        while(low < nums.length - 1 && nums[low] == nums[++low]) {}
        return low;
    }

    public int dec(int[] nums, int high) {
        while(high > 1 && nums[high] == nums[--high]) {}
        return high;
    }
}
