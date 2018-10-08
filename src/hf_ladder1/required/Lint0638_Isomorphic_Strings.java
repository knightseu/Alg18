//https://leetcode.com/problems/isomorphic-strings/description/
// lint 638        https://www.lintcode.com/problem/isomorphic-strings/description?_from=ladder


/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example
Given s = "egg", t = "add", return true.

Given s = "foo", t = "bar", return false.

Given s = "paper", t = "title", return true.

Notice
You may assume both s and t have the same length.
 */

import java.util.HashMap;

public class Lint0638_Isomorphic_Strings {
    /**
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    public boolean isIsomorphic(String s, String t) {
        // write your code here
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (!map.containsKey(a)) {
                if (!map.containsValue(b)) {
                    map.put(a, b);
                }
                else {
                    return false;
                }
            }
            else {
                if (!map.get(a).equals(b)) {
                    return false;
                }

            }
        }

        return true;
    }
}
