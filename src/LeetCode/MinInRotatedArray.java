package LeetCode;

/**
 * Created by guangyw on 8/10/15.
 */
public class MinInRotatedArray {
//    Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//
//            (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//    Find the minimum element.
//
//    You may assume no duplicate exists in the array.
    public int findMinNoDuplicates(int[] nums) {
        int low = 0, high = nums.length -1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }

//    Follow up for "Find Minimum in Rotated Sorted Array":
//    What if duplicates are allowed?
//
//    Would this affect the run-time complexity? How and why?

    public int findMin(int[] nums) {
        int low = 0; int high = nums.length -1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == nums[high]) {
                high--;
            } else if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
