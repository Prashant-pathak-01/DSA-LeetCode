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
    public int func(TreeNode root, int sum){
        if(root==null) return 0;
        if(root.right!=null) sum=func(root.right,sum);
        int a = root.val;
        sum+=a;
        root.val = sum;
        if(root.left!=null) sum=func(root.left,sum);
        return sum;

    }
    public TreeNode bstToGst(TreeNode root) {
        func(root,0);
        return root;
    }
}