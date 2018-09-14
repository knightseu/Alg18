import java.util.Stack;

import commonds.TreeNode;

/**
 * Created by seanlx on 8/24/18.
 * 
 * ref: https://leetcode.com/problems/validate-binary-search-tree/discuss/32112/Learn-one-iterative-inorder-traversal-apply-it-to-multiple-tree-questions-(Java-Solution)
 */
public class Lc0098_ValidateBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root!=null || !stack.empty()) {
        	    while (root!=null) {
        	    	    stack.push(root);
        	    	    root = root.left;
        	    }
        	    root = stack.pop();
        	    if (pre!=null && pre.val >= root.val) {
        	    	    return false;
        	    }
        	    pre = root;
        	    root = root.right;
        }
        
        return true;

    }
}
