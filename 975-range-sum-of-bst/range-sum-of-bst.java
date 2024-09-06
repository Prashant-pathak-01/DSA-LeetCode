class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int res =0;
        if(low<=root.val && high>=root.val) res+=root.val;
        return res+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }
}