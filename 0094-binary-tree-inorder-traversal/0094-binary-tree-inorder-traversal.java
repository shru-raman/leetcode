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
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        //left child right
        iterative(root);
        return list;
    }

    //iterative
    private void iterative(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        while(root!=null) {
            stk.add(root);
            root = root.left;
        }
        while(!stk.isEmpty()){
            TreeNode cur = stk.pop(); //4 //2
            list.add(cur.val); //4 //2
            cur = cur.right; //null //5
            while(cur!=null) {
                stk.add(cur); //5
                cur = cur.left; //null //8
            }
        }
    }

    //recursive
     private void inorder(TreeNode root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
     }
}