class Solution {

    int res = 0;
    public int solve(TreeNode root){
        if(root==null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        res = Math.max(res,Math.max(left+right,Math.max(left,right)));
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        solve(root);
        return res;
    }
}