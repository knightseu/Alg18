//https://leetcode.com/problems/balanced-binary-tree/submissions/1

import commonds.TreeNode;

public class Lc0110_BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}
	
	public int dep(TreeNode root) {
		if (root == null) {
			return 0;
		}
		else {
			return Math.max(dep(root.left), dep(root.right))+1;
		}
	}
	
    public boolean isBalanced(TreeNode root) {
        return true;
    }

}
