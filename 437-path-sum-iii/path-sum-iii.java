class Solution {
    public int check(TreeNode root, long tar){
        if(root==null) return 0;
        int res= 0;
        if(tar==root.val) res = 1;
        return res+check(root.left,tar-root.val)+check(root.right,tar-root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int res =check(root,targetSum);
        res+=pathSum(root.left,targetSum);
        res+=pathSum(root.right,targetSum);
        return res;
    }
}