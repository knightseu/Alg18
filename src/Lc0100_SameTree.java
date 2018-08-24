import commonds.TreeNode;
//https://leetcode.com/problems/same-tree/description/
public class Lc0100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	    if (p==null && q!=null) {
    	    	    return false;
    	    }
    	    else if (p!=null && q==null) {
    	    	    return false;
    	    }
    	    else if (p==null && q==null) {
    	    	    return true;
    	    }
    	    else {
    	    	    if (q.val!=p.val) {
    	    	    	    return false;
    	    	    }
    	    	    else {
    	    	    	    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    	    	    }
    	    }
    }
}
