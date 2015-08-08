package LeetCode;

/**
 * Created by guangyw on 7/30/15.
 */
public class strstr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        if (source == null || target == null) return -1;
        if (target == "") {
            return 0;
        }
        if (source == "") {
            return -1;
        }
        //write your code here
        for (int i = 0; i < source.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                int k = i;
                while (source.charAt(k) == target.charAt(j)) {
                    k++;
                    j++;
                    if (k >= source.length()) {
                        return -1;
                    }
                    if (j >= target.length() -1) {
                        return i;
                    }
                }
                break;
            }
        }
        return -1;
    }

}
