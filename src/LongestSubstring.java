/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstring {
    public static void main(String[] args){
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("pwwkew"));
    }
    public int lengthOfLongestSubstring(String s) {
        int result = 0, len = 0;
        int length = s.length();
        if (length > 1) {
            int i = 0, j = 1;
            while (j != length) {
                int p  = s.substring(i, j).indexOf(s.charAt(j));
                len = j - i;
                if ( p!= -1) {
                    i += p + 1;
                }else{
                    len++;
                }
                if (len > result) result = len;
                j++;
            }
        }else{
            result = length;
        }
        return result;
    }
}
