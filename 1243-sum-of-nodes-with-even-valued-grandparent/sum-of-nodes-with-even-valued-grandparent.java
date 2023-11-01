class Solution {
    public int counter(TreeNode root,int f, int gf){
        if(root==null) return 0;
        int temp = (gf%2==0)?root.val:0;
        return counter(root.left,root.val,f)+counter(root.right,root.val,f)+temp;
    }
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null || (root.left==null && root.right==null)) return 0;
        return counter(root,1,1);
    }
}