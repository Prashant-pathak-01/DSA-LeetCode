class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(p==root || q==root) return root;
        if(lowestCommonAncestor(root.left,p,q)==null) return lowestCommonAncestor( root.right, p, q);
        if(lowestCommonAncestor(root.right,p,q)==null) return lowestCommonAncestor( root.left, p, q);
        return root;
    }
}