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
    public int maxLevelSum(TreeNode root) {
        int result = Integer.MIN_VALUE;
        int maxLevel = 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int level = 0 ;
        while(!que.isEmpty()) {
            int size = que.size();
            int sum = 0;
            level++;
            while(size-- >0) {
                TreeNode node = que.poll();
                sum = sum + node.val;
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
            }
            if(sum>result){
                result = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
}