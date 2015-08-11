package LeetCode;

//Given an unsorted integer array, find the first missing positive integer.
//
//        For example,
//        Given [1,2,0] return 3,
//        and [3,4,-1,1] return 2.
//
//        Your algorithm should run in O(n) time and uses constant space.

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] > 0 && nums[i] < nums.length && nums[nums[i] - 1] != nums[i]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp -1] =  tmp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        //!!!When no element is misplaced, return the next integer
        return nums.length + 1;
    }
}
