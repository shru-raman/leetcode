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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = dfs(root1, new ArrayList<>());
        List<Integer> list2 = dfs(root2, new ArrayList<>());
        if(list1.size()!=list2.size()){
            return false;
        }
        for(int i = 0;i<list1.size();i++) {
            if(list1.get(i)!=list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> dfs(TreeNode node, List<Integer> list) {
        if(node == null) {
            return list;
        }
        if(node.left==null && node.right==null) {
            list.add(node.val);
        }
        dfs(node.left, list);
        dfs(node.right, list);
        return list;
    }
}