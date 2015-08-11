package LeetCode;

/**
 * Created by guangyw on 8/10/15.
 */
public class MaxProductInArray {
    public int maxProduct(int[] nums) {
        int preMax = nums[0], preMin = nums[0];
        int realMax = preMax;
        for (int i = 1; i < nums.length; i++) {
            int tmpMax = preMax;
            preMax = Math.max(Math.max(preMax * nums[i], nums[i]), preMin * nums[i]);
            preMin = Math.min(Math.min(preMin * nums[i], nums[i]), tmpMax * nums[i]);
            if (preMax > realMax) {
                realMax = preMax;
            }
        }
        return realMax;
    }
}
