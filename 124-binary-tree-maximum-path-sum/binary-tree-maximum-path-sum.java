class Solution {
    public int max(TreeNode root){
        if(root==null) return 0;
        int sum = root.val;
        sum=Math.max(sum+Math.max(max(root.left),max(root.right)),sum);
        return sum;
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return Integer.MIN_VALUE;
        int a = root.val;
        a = Math.max(a,a+max(root.left));
        a = Math.max(a,a+max(root.right));
        int b = maxPathSum(root.left);
        int c = maxPathSum(root.right);
        return Math.max(a,Math.max(b,c));
    }
}