package LeetCode;

/**
 * Created by guangyw on 7/7/15.
 */
public class ValiadPalindrome {
    public boolean isPalindrome(String s) {
        if (s == "") return true;
        for (int i = 0, j = s.length() -1; i <= j;) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                ++i;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                --j;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
