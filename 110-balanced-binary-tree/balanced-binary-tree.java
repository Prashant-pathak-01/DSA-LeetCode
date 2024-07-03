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
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean solve(TreeNode root){
        if(root==null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right)>1) return false;
        return solve(root.left) && solve(root.right); 

    }
    public boolean isBalanced(TreeNode root) {
        return solve(root);
    }
}