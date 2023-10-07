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
    boolean exists = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        path(root, 0 , targetSum);
        return exists;
    }

    private void path(TreeNode node, int curSum, int target){
        if(node == null){
            return;
        }
        if(node.left==null && node.right==null && curSum+node.val == target){
            exists = true;
        }
        curSum = curSum + node.val;//5 //9 //20 //27
        path(node.left, curSum, target); //(4,5,22)
        path(node.right, curSum, target);
    }
}