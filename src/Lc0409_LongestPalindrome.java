// https://leetcode.com/problems/longest-palindrome/description/

import java.util.HashMap;
import java.util.Map;

// Lint 629
public class Lc0409_LongestPalindrome {
    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public static int longestPalindrome(String s) {
        // write your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        boolean odd_char = false;
        for (Map.Entry<Character, Integer> item: map.entrySet()) {
            if (item.getValue() > 1) {
                count += item.getValue();
            }
            else if (! odd_char && item.getValue() == 1) {
                odd_char = true;
            }
        }
        return odd_char ? count + 1 : count;
    }

    public static int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray()) {
            count[c]++;
        }

        int rst = 0;
        for (int v: count) {
            rst += v / 2 * 2;
            if (rst % 2 == 0 && v % 2 ==1) {
                //This can only happen once
                rst++;
            }
        }
        return rst;
    }


    public static void main(String args[]) {
        System.out.println(longestPalindrome2("abccccdd"));
    }

}
