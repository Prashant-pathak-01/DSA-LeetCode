class Solution {
    public int height(TreeNode root, int data){
        if(root==null) return 0;
        if(root.val!=data) return 0;
        return 1+Math.max(height(root.left,data),height(root.right,data));
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        int height = height(root.left,root.val)+height(root.right,root.val);
        int left = longestUnivaluePath(root.left);
        int right = longestUnivaluePath(root.right);
        return Math.max(height,Math.max(left,right));
    }
}