class Solution {
    public int solve(TreeNode root, boolean flag){
        if(root==null) return 0;
        if(flag && root.left==null && root.right==null) return root.val ;
        int left = solve(root.left,true);
        int right = solve(root.right,false);
        return left+right;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root,false);
    }
}