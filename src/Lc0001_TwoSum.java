import java.util.HashMap;

//https://leetcode.com/problems/two-sum/description/
public class Lc0001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int[] pair = new int[2];
                pair[0] = map.get(target - nums[i]);
                pair[1] = i;
                return pair;
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String args[]) {
        System.out.println("Hello Xuan");
    }
}
