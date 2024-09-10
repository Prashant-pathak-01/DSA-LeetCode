class Solution {
    public TreeNode find(TreeNode root, int x){
        if(root==null) return null;
        if(root.val==x) return root;
        TreeNode left = find(root.left,x);
        TreeNode right = find(root.right,x);
        if(left!=null) return left;
        if(right!=null) return right;
        return null;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1+height(root.left)+height(root.right);
    }
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        TreeNode temp = find(root,x);
        int l = height(temp.left);
        int r = height(temp.right);
        if(l>n/2 || r>n/2 || n-l-r-1>n/2) return true;
        return false;
    }
}