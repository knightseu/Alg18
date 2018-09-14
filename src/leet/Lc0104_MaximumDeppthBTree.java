//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

import commonds.TreeNode;

public class Lc0104_MaximumDeppthBTree {
	
    public int maxDepth(TreeNode root) {
        if (root == null) {
        	    return 0;
        }
        else {
        	    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
