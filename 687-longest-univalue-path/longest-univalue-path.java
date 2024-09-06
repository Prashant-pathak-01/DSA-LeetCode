class Solution {
    int res= 0;
    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        int l  = 0;
        int r  =0;
        if(root.left!=null && root.left.val==root.val) l = 1+left;
        if(root.right!=null && root.right.val==root.val) r =1+right;
        res = Math.max(res,l+r);
        return Math.max(l,r);
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return res;
    }
}