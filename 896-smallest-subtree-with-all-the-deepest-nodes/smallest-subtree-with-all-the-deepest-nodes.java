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
        int left = 1+height(root.left);
        int right=  1+height(root.right);
        return Math.max(left,right);
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int left = height(root.left);
        int right = height(root.right);
        if(left==right) return root;
        else if(left>right) return subtreeWithAllDeepest(root.left);
        else return subtreeWithAllDeepest(root.right);
    }
}