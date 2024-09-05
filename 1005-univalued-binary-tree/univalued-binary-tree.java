class Solution {
    public boolean isSame(TreeNode root, int data){
        if(root==null) return true;
        if(root.val!=data) return false;
        return isSame(root.left,data) && isSame(root.right, data);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        return isSame(root,root.val);   
    }
}