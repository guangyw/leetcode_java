package LeetCode;
public class LongestPalinDrome {
    public class Expanded {
        public int l, r;
        public int longest;
        public Expanded(int l, int r, int longest) {
            this.l = l;
            this.r = r;
            this.longest = longest;
        }
    }
    public String longestPalindrome(String s) {
        int longest = 0;
        int l = 0, r = s.length();
        Expanded exp;
        for(int i=0; i < s.length(); ++i) {
            exp = expand(s,i,i);
            if (exp.longest > longest) {
                longest = exp.longest;
                l = exp.l;
                r = exp.r;
            }
            exp = expand(s, i, i+1);
            if (exp.longest > longest) {
                longest = exp.longest;
                l = exp.l;
                r = exp.r;
            }
        }
        return s.substring(l, r + 1);
    }
    public Expanded expand(String s, int l, int r) {
        int i = l, j = r;
        int longest = 0;
        while(i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                longest = j - i + 1;
                i--;
                j++;
            }else {
                return new Expanded(i + 1, j -1, longest);
            }
        }
        return new Expanded(i+1, j-1, longest);
    }
}
