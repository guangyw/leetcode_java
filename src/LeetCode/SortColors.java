package LeetCode;

/**
 * Created by guangyw on 8/11/15.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length -1;
        for (int i = low; i <= high; i++) {
            if (nums[i] == 0) {
                int tmp = nums[low];
                nums[low] = nums[i];
                nums[i] = tmp;
                low++;
            } else if (nums[i] == 2) {
                int tmp = nums[high];
                nums[high] = nums[i];
                nums[i] = tmp;
                high--;
                i--;
            }
        }
    }
}
