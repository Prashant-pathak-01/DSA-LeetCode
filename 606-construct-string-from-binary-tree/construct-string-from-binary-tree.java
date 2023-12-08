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
    public void traverse(TreeNode root, StringBuilder str){
        if(root==null) {
            return;
        }
        str.append(root.val+"");
        if(root.left==null && root.right==null) return;
        str.append("(");
        traverse(root.left,str);
        str.append(")");

        if(root.right!=null){
            str.append("(");
            traverse(root.right,str);
            str.append(")");
        }

    }
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        StringBuilder res = new StringBuilder();
        traverse(root,res);
        return res.toString();
    }
}