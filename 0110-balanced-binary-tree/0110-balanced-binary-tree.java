/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        rec(root);
        return isBalanced;
    }

    private int rec(TreeNode node) {
        if(node==null){
            return 0;
        }
        int lval = rec(node.left);
        int rval = rec(node.right);
        if(Math.abs(lval-rval)>1) {
            isBalanced = false;
        }
        return Math.max(lval, rval) + 1;
    }
}