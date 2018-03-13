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
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        String longest = s.substring(0, 1);
        int len = s.length();
        for (int i = 1; i < 2 * len; i++) {
            int re = i % 2;
            int l = (i - re) / 2, r = (i + re) / 2;
            while (l > -1 && r < len && (s.charAt(l) == s.charAt(r))) {
                l--;
                r++;
            }
            String pal = s.substring(l + 1, r);
            if (pal.length() > longest.length()) {
                longest = pal;
            }
        }
        return longest;
    }
}
