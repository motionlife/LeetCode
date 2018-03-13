/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p>
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * <p>
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * <p>
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * <p>
 * There is a more generic way of solving this problem.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long y = 0;
        long t = x;
        while (x != 0) {
            y = x % 10 + y * 10;
            x = x / 10;
        }
        return y == t;
    }
}
