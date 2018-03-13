/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * <p>
 * Example:
 * Input: "cbbd"
 * Output: "bb
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("abcde"));
    }

    public String longestPalindrome(String s) {
        int i = 0;
        String longest = s.substring(0, 1);
        int len = s.length();
        while (i < len) {
            int l = 0, r = 0;
            while (s.charAt(i - l) == s.charAt(i + r)) {
                l++;
                r++;
            }
            String pal = s.substring(i - l, i + r - 1);
            if (pal.length() > longest.length()) {
                longest = pal;
            }
            i += r;
        }
        return longest;
    }
}
