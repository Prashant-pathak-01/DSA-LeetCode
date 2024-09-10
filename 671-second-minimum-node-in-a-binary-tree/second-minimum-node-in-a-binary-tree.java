class Solution {
    long min  = Long.MAX_VALUE;
    long secMin = Long.MAX_VALUE;
    public void solve(TreeNode root){
        if(root==null) return;
        if(root.val<min){
            secMin = min;
            min = root.val;
        }else if(root.val>min && root.val<secMin){
            secMin = root.val;
        }
        solve(root.left);
        solve(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        solve(root);
        return secMin==Long.MAX_VALUE?-1:(int)secMin;
    }
}