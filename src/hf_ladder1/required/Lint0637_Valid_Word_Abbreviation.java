//
// https://www.lintcode.com/problem/valid-word-abbreviation/description?_from=ladder

/*
Description
Given a non-empty string word and an abbreviation abbr, return whether the string matches with the given abbreviation.

A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
Notice that only the above abbreviations are valid abbreviations of the string word. Any other string is not a valid abbreviation of word.

Have you met this question in a real interview?
Example
Example 1:

Given s = "internationalization", abbr = "i12iz4n":
Return true.
Example 2:

Given s = "apple", abbr = "a2e":
Return false.
 */
public class Lc0408_Valid_Word_Abbreviation {
    public static boolean validWordAbbreviation(String word, String abbr) {
        int l=0;
        int r=0;
        while (l<word.length() && r<abbr.length()) {
            if (abbr.charAt(r) > '9' || abbr.charAt(r) < '0') {
                //this is a character
                if (word.charAt(l) != abbr.charAt(r)) {
                    return false;
                }
            }
            else if (abbr.charAt(r) == '0') {
                return false;
            }
            else {
                int end = r;
                while (end<abbr.length() && abbr.charAt(end) <= '9' && abbr.charAt(end) >= '0') {
                    end++;
                }
                if (end == abbr.length()) {
                    if (Integer.parseInt(abbr.substring(r)) + l > word.length()) {
                        return false;
                    }
                    return true;
                }
                else {
                    if (Integer.parseInt(abbr.substring(r, end)) + l > word.length()) {
                        return false;
                    }
                    else {
                        l += Integer.parseInt(abbr.substring(r, end));
                        r = end;
                    }
                }
            }
            l++;
            r++;
        }
        return true;
    }

    public static void main(String args[]) {
//        System.out.println(validWordAbbreviation("internationalization", "i12iz4n"));
//        System.out.println(validWordAbbreviation("a", "1"));
        System.out.println(validWordAbbreviation("aa", "a2"));
    }


    //
    //"i12iz4n"
}
