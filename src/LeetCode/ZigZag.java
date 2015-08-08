package LeetCode;

/**
 * Created by guangyw on 7/8/15.
 */
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
