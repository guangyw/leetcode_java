package LeetCode;

/**
 * Created by guangyw on 7/30/15.
 */
public class Anagram {

        public boolean anagram(String s1, String s2) {
            if(s1.length()!=s2.length())
                return false;
            int count1=0,count2=0;
            int[] a = new int[256];
            for(int i=0;i<s1.length();i++){
                if(a[s1.charAt(i)]++==0)
                    count1++;
            }
            for(int i=0;i<s2.length();i++){
                if(a[s2.charAt(i)]==0)
                    return false;
                if(--a[s2.charAt(i)]==0)
                    count2++;
            }
            if(count1==count2)
                return true;
            else
                return false;
        }
}
