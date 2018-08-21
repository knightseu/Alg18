import java.util.HashMap;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class Lc0167_TwoSumII {

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[] {left+1, right+1};
            }
            else if (nums[left] + nums[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String args[]) {
        System.out.println("Hello Xuan");
    }
}
