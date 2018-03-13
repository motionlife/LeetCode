/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output:  321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
    }

    public int reverse(int x) {
        long y = 0;
        while (x != 0) {
            y = x % 10 + y * 10;
            x = x / 10;
        }
        return y > Integer.MAX_VALUE || y < Integer.MIN_VALUE ? 0 : (int) y;
    }
}
