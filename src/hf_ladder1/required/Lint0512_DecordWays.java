// https://leetcode.com/problems/decode-ways/description/
// lint 512 https://www.lintcode.com/problem/decode-ways/description?_from=ladder

/*
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

Example
Given encoded message 12, it could be decoded as AB (1 2) or L (12).
The number of ways decoding 12 is 2.
 */

public class Lint0512_DecordWays {
    /**
     * @param s: a string,  encoded message
     * @return: an integer, the number of ways decoding
     */
    public int numDecodings(String ss) {
        if (ss==null || ss.length() == 0) {
            return 0;
        }

        char[] s= ss.toCharArray();

        int cur = s[0] == '0' ? 0: 1;
        int previous = 1;

        for (int i=1; i<s.length; i++) {
            if (s[i] == '0') {
                cur = 0;
            }

            if (s[i-1] == '1' || s[i-1] == '2' && s[i] <= '6') {
                cur = cur + previous;
                previous = cur - previous;
            }
            else  {
                //single digit
                previous = cur;
            }
        }
        return cur;
    }


}
