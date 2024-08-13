class Solution {
    public int solve(TreeNode root, int data){
        if(root==null) return 0;
        if(root.left==null && root.right==null) {
            return data*10+root.val;
        }
        int a = solve(root.left,data*10+root.val);
        int b = solve(root.right,data*10+root.val);
        return a+b;
    }
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        return solve(root,0);
    }
}