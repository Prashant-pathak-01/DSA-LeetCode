class Solution {
    public void solve(TreeNode root, int val){
        if(root==null) {
            return;
        }
        if(root.val>val) {
            if(root.left==null) {
                root.left = new TreeNode(val);
            }else solve(root.left,val);
        }
        else {
            if(root.right==null){
                root.right = new TreeNode(val);
            }else solve(root.right,val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        solve(root,val);
        return root;
    }
}