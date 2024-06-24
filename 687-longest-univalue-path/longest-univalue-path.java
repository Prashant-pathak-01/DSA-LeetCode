class Solution {
    public int length(TreeNode root, int tar){
        if(root==null || root.val!=tar) return 0;
        return 1+Math.max(length(root.left,tar),length(root.right,tar));
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        return Math.max(length(root.left,root.val)+length(root.right,root.val),Math.max(longestUnivaluePath(root.left),longestUnivaluePath(root.right)));
    }
}