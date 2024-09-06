class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        if(low<=root.val && high>=root.val) return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        return rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }
}