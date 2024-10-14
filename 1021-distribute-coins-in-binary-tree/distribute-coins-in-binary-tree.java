class Solution {
    int res = 0;
    public int solve(TreeNode root){
        if(root==null) return 0;
        int l = solve(root.left);
        int r = solve(root.right);
        root.val+=l+r;
        res+=Math.abs(root.val-1);
        return root.val-1;
    }
    public int distributeCoins(TreeNode root) {
        solve(root);
        return res;
    }
}