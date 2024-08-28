class Solution {
    int res = Integer.MIN_VALUE;
    public int solve(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) {
            res =  Math.max(res,root.val);
            return Math.max(0,root.val);
        }
        int left = solve(root.left);
        int right = solve(root.right);
        res = Math.max(res,root.val+right);
        res = Math.max(res,root.val+left);
        res = Math.max(res,root.val);
        res = Math.max(res,left+right+root.val);
        return Math.max(0,root.val+Math.max(left,right));
    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return res;
    }
}