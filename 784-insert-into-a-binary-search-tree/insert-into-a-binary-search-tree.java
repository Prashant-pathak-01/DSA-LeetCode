class Solution {
    public TreeNode solve(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val>val) {
            root.left = solve(root.left,val);
        }
        else {
            root.right = solve(root.right,val);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        solve(root,val);
        return root;
    }
}