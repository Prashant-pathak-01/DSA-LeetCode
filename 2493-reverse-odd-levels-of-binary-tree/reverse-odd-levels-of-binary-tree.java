class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return root;
        swapping(root.left,root.right,1);
        return root;
    }
    public void swapping(TreeNode left, TreeNode right, int level){
        if(left==null || right==null) return;
        if(level%2==1){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        swapping(left.left,right.right,level+1);
        swapping(left.right,right.left,level+1);
    }
}