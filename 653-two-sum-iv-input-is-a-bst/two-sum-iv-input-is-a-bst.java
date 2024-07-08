class Solution {
    public boolean possible(TreeNode r1, TreeNode r2, int k){
        if(r1==null || r2==null) return false;
        if(r2!=r1 && r2.val==k) return true;
        if(k<r2.val && possible(r1,r2.left,k)) return true;
        if(k>r2.val && possible(r1,r2.right,k)) return true;
        return false;
    }
    public boolean solve(TreeNode root1, TreeNode root2,int k){
        if(root1==null) return false;
        if(possible(root1,root2,k-root1.val)) return true;
        if(solve(root1.left,root2,k)) return true;
        if(solve(root1.right,root2,k)) return true;
        return false;
    }
    public boolean findTarget(TreeNode root, int k) {
        return solve(root,root,k);
    }
}