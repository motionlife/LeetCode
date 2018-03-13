/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(new ZigZagConversion().convert("PAYPALISHIRING",4));
    }
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int n = s.length();
        StringBuilder sb = new StringBuilder(n);
        int pack = 2 * numRows - 2;
        int units = n / pack;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= units; j++) {
                int k = j * pack + i;
                if (k < n) sb.append(s.charAt(k));
                if (i > 0 && i < numRows - 1) {
                    k = (j + 1) * pack - i;
                    if (k < n) sb.append(s.charAt(k));
                }
            }
        }
        return sb.toString();
    }
}
