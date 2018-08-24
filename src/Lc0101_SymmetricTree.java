import commonds.TreeNode;
//https://leetcode.com/problems/symmetric-tree/description/

public class Lc0101_SymmetricTree {
	public boolean helper(TreeNode left, TreeNode right) {
		if (left == null && right ==null) {
			return true;
		}
		else if (left==null || right==null) {
			return false;
		}
		else if (left.val!=right.val) {
			return false;
		}
		else {
			return helper(left.left, right.right) && helper(left.right, right.left);
		}
	}
	
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
        	    return true;
        }
        
    	    return helper(root.left, root.right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
