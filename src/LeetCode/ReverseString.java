package LeetCode;

/**
 * Created by guangyw on 7/30/15.
 */
public class ReverseString {
    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {
        // write your code
        String[] splits = s.split(" ");
        String sep = "";
        StringBuilder sb = new StringBuilder();
        for (int i = splits.length -1; i >= 0; i--) {
            if (splits[i] != " ") {
                sb.append(sep);
                sep = " ";
                sb.append(splits[i]);
            }
        }
        return sb.toString();
    }
}
