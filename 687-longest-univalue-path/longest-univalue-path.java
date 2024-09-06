class Solution {
    int res= 0;
    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        int height  = 0;
        if(root.left!=null && root.left.val==root.val) height = left;
        if(root.right!=null && root.right.val==root.val) height += right;
        res = Math.max(res,Math.max(height+1,Math.max(left,right)));
        int ret = 1;
        if(root.left!=null && root.left.val==root.val) ret = 1+left;
        if(root.right!=null && root.right.val==root.val) ret = Math.max(1+right,ret);
        return ret;
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return res-1;
    }
}