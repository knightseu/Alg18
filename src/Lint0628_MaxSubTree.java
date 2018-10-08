
//https://www.lintcode.com/problem/maximum-subtree/description?_from=ladder&&fromId=14

/*
Description
Given a binary tree, find the subtree with maximum sum. Return the root of the subtree.

LintCode will print the subtree which root is your return node.
It's guaranteed that there is only one subtree with maximum sum and the given binary tree is not an empty tree.

Have you met this question in a real interview?  
Example
Given a binary tree:

     1
   /   \
 -5     2
 / \   /  \
0   3 -4  -5 
return the node with value 3.
*/
import commonds.TreeNode;
public class Lint0628_MaxSubTree {
    /**
     * @param root: the root of binary tree
     * @return: the maximum weight node
     */

    public int max_weight = Integer.MIN_VALUE;
    public TreeNode rst = null;

    public TreeNode findSubtree(TreeNode root) {
        // write your code here
        helper(root);
        return rst;
    }

    /**
     * 
     * @param root the root node of the tree
     * @return the sum weight of tree root; side effect - set rst and max_weight
     */
    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int cur_weight = helper(root.left) + helper(root.right) + root.val;

        if (rst == null || cur_weight > max_weight) {
            max_weight = cur_weight;
            rst = root;
        }
        return cur_weight;
    }
}