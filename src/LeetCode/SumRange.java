package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangyw on 7/8/15.
 */
public class SumRange {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int start = nums[0];
        int end = start;
        int last = start;
        boolean newRange = true;
        for (int i = 0; i < nums.length; ++i) {
            if (newRange) {
                newRange = false;
                start = nums[i];
                end = start;
                last = start;
                continue;
            }
            if (nums[i] == last + 1) {
                last++;
            } else {
                end = last;
                if (end > start) {
                    res.add(Integer.toString(start) + "->" + Integer.toString(end));
                } else {
                    res.add(Integer.toString(start));
                }

                newRange = true;
            }
        }
        return res;
    }
}
