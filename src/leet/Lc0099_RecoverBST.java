import commonds.TreeNode;
import java.util.Stack;


public class Lc0099_RecoverBST {
    public static void recoverTree(TreeNode root) {
        TreeNode first=null, second=null, pre=null;
        Stack<TreeNode> stack = new Stack<>();
        
        while (root!=null || !stack.empty()) {
        	    while (root != null) {
        	    	    stack.push(root);
        	    	    root = root.left;
        	    }
        	    root = stack.pop();
        	    if (pre!=null && pre.val>root.val && first == null) {
        	    	    //we find the first element;
        	    	    first = pre;
        	    }
        	    if (pre!=null && pre.val>root.val && first !=null) {
        	    	    //we find the second element;
        	    	    second = root;
        	    	    break;
        	    }
        	    pre = root;
        	    root = root.right;
        	    
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    public static void main(String args[]) {
    	    TreeNode n1 = new TreeNode(1);
    	    TreeNode n3 = new TreeNode(3);
    	    n1.left = n3;
    	    TreeNode n2 = new TreeNode(2);
    	    n3.right = n2;
    	    recoverTree(n1);
    }
   
}
