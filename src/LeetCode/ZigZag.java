package LeetCode;

//There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
//
//        You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
//
//        Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
public class ZigZag {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] sbs = new StringBuilder[numRows];
        boolean dir = true;
        int j = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (sbs[j] == null) {
                sbs[j] = new StringBuilder();
            }
            sbs[j].append(s.charAt(i));
            if (dir) {
                if (++j == numRows) {
                    dir = !dir;
                    j-= 2;
                }
            } else {
                if (--j < 0) {
                    dir = !dir;
                    j += 2;
                }
            }
        }
        for (int i = 1; i < sbs.length; i++) {
            if (sbs[i] != null) {
                sbs[0].append(sbs[i]);
            }

        }
        return sbs[0].toString();
    }
}
