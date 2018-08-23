//https://www.lintcode.com/problem/3sum-smaller/description

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lint0918_3Sum_smaller {
    public int threeSumSmaller(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i=0; i<nums.length-2; i++) {
            if (nums[i]*2 > target) {
                break;
            }

            int l=i+1;
            int r=nums.length-1;

            int nextTarget = target - nums[i];

            while (l<r) {
                if (nums[l] + nums[r] < nextTarget) {
                    l++;
                    count += (r-l);
                }
                else {
                    r--;
                }
            }
        }
    }
}
