class Pair{
    int h;
    boolean bal;
    Pair(int h, boolean bal){
        this.h = h;
        this.bal = bal;
    }
}
class Solution {
    
    public Pair solve(TreeNode root){
        if(root==null) return new Pair(0,true);
        Pair left = solve(root.left);
        Pair right = solve(root.right);
        if(!left.bal || !right.bal || Math.abs(left.h-right.h)>1) return new Pair(0,false);
        Pair res = new Pair(1+Math.max(left.h,right.h),true);
        return res;

    }
    public boolean isBalanced(TreeNode root) {
        return solve(root).bal;
    }
}