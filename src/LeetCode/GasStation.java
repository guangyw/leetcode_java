package LeetCode;

/**
 * Created by guangyw on 8/8/15.
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remaining = 0;
        int start = 0, total = 0;
        for (int i = 0; i < gas.length; i++) {
            remaining += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (remaining < 0) {
                remaining = 0;
                start = i + 1;
            }
        }
        if (total < 0) return -1;
        return start;
    }
}
