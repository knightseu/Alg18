//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/

import common.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Lc0653_TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);

    }

    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }


    public static void main(String args[]) {
        System.out.println("Hello Xuan");
    }
}
