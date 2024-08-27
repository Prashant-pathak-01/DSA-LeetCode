class Solution {
    int res =0 ;
    public int solve(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return -1;
        int left = solve(root.left);
        int right = solve(root.right);
        if(left==-1 || right==-1) {
            res++;
            return 1;
        }
        if(left==1 || right==1){
            return 0;
        }
        return -1;

    }
    public int minCameraCover(TreeNode root) {
        int temp = solve(root);
        return (temp==-1?1:0)+res;
    }
}