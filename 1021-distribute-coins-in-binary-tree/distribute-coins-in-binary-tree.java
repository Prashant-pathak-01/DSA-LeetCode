class Solution {
    int res = 0;
    public int solve(TreeNode root){
        if(root==null) return 0;
        int l = solve(root.left);
        int r = solve(root.right);
        res+=Math.abs(l)+Math.abs(r);
        return l+r+root.val-1;
    }
    public int distributeCoins(TreeNode root) {
        solve(root);
        return res;
    }
}