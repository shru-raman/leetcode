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
    public List<Integer> rightSideView(TreeNode root) {
        if(root ==null){
            return Collections.emptyList();
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        List<Integer> result = new ArrayList<>();
        while(!que.isEmpty()) {
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            while(size-- >0) {
                TreeNode node = que.poll();
                if(node.left!=null) {
                    que.add(node.left);
                }
                if(node.right!=null) {
                    que.add(node.right);
                }
                list.add(node.val);
            }
            result.add(list.get(list.size()-1));
        }
        return result;
    }
}