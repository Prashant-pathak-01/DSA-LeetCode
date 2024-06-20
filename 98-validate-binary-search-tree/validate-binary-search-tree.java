class Solution {
    public boolean isValid(TreeNode root, long min, long max){
        if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;
        boolean res = true;
        res = isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
        return res;
    }
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}