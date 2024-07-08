class Solution {
    public TreeNode solve(TreeNode l,TreeNode r){
        if(r==null) return l;
        else r.left = solve(l,r.left);
        return r;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val>key) root.left = deleteNode(root.left,key);
        else if(root.val<key)  root.right = deleteNode(root.right,key);
        else {
            if(root.left==null) {
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                return solve(root.left,root.right);
            }
        }
        return root;
    }
}