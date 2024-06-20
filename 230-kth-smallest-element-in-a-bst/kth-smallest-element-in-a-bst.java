class Solution {
    int count  = 1;
    int res= 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        kthSmallest(root.left,k);
        if(k==count) res = root.val;
        count++;
        kthSmallest(root.right,k);
        return res;
    }
}