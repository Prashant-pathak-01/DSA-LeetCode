class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        if(high<root.val) return rangeSumBST(root.left,low,high);
        if(low>root.val) return rangeSumBST(root.right,low,high);
        return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }
}