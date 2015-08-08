package LeetCode;

import java.util.ArrayList;

/**
 * Created by guangyw on 7/30/15.
 */
public class LongestString {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        int longestLen = 0;
        ArrayList<String> res = new ArrayList<>();
        for (String s: dictionary) {
            if (s.length() > longestLen) {
                res = new ArrayList<>();
                res.add(s);
                longestLen = s.length();
            } else if (s.length() == longestLen) {
                res.add(s);
            }
        }
        return res;
    }

}
