import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/description/
public class Lc0015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        if (nums == null || nums.length < 1) {
            return rst;
        }
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++) {
            int j =  i+1;
            int k = nums.length - 1;
            while (j<k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    k--;
                    j++;
                }
                else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return null;
    }
}
