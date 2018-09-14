// lint 641 https://lintcode.com/problem/missing-ranges/description?_from=ladder
/*
641. Missing Ranges
Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.

Example
Given nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99
return ["2", "4->49", "51->74", "76->99"].
 */

import java.util.ArrayList;
import java.util.List;

public class Lc0163_MissingRange {
    /*
     * @param nums: a sorted integer array
     * @param lower: An integer
     * @param upper: An integer
     * @return: a list of its missing ranges
     */
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        // write your code here
        List<String> rst = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            addRange(rst, lower, upper);
            return rst;
        }

        if (lower < nums[0]) {
            addRange(rst, lower, nums[0] - 1);
        }


        for (int i =1; i< nums.length; i++) {
            if (nums[i] > Integer.MIN_VALUE && nums[i] > nums[i-1]) {
                addRange(rst, nums[i - 1] + 1, nums[i] - 1);
            }
        }

        if (upper > nums[nums.length-1]) {
            addRange(rst, nums[nums.length - 1] + 1, upper);
        }

        return rst;
    }

    public void addRange(List<String> rst, int start, int end) {
        if (start>end) {
            return;
        }
        if (start==end) {
            rst.add(start + "");
            return;
        }
        rst.add(start + "->" + end);
    }
}
