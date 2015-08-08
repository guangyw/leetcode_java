package LeetCode;

import java.util.ArrayList;

/**
 * Created by guangyw on 7/30/15.
 */
public class MaxSubArray {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
        int[] max = new int[nums.size()];
        max[0] = nums.get(0);
        int maxmax = max[0];
        for (int i = 1; i < nums.size(); i++) {
            max[i] = Math.max(nums.get(i), max[i-1] + nums.get(i));
            if (max[i] > maxmax) {
                maxmax = max[i];
            }
        }
        return maxmax;
    }

}
