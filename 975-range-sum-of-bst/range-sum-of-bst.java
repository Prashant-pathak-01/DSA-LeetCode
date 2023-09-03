
class Solution {
    public int func(TreeNode root, int low, int high){
        if(root==null) return 0;
        int sum = 0;
        if(root.val>=low && root.val<=high) sum+=root.val;
        if(root.val>low) sum+=func(root.left,low,high);
        if(root.val<high) sum+=func(root.right,low,high);
        
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return func(root,low,high);
    }
}