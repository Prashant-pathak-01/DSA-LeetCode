class Solution {
    public long solve(long depth, TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        if(depth==1) return root.val;
        long left = solve(depth-1,root.left);
        if(left!=Long.MIN_VALUE) return left;
        long right = solve(depth-1,root.right);
        return right;
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
    public int findBottomLeftValue(TreeNode root) {
        int depth = depth(root);
        return (int)solve(depth,root);

    }
}