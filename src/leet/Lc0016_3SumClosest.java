import java.lang.reflect.Array;
import java.util.Arrays;

public class Lc0016_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        Arrays.sort(nums);

        int rst = nums[0] + nums[1] + nums[nums.length-1];

        for (int i=0; i< nums.length-2; i++) {
            int l=i+1;
            int r=nums.length-1;
            while (l<r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > target) {
                    r--;
                }
                else {
                    l++;
                }
                if (Math.abs(sum - target) < Math.abs(rst - target)) {
                    rst = sum;
                }
            }
        }
        return rst;
    }
}
