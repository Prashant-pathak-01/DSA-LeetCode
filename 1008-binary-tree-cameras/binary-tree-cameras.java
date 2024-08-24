class Solution {
    int count =0;
    public int solve(TreeNode root){
        if(root==null) return -1;
        if(root.left==null && root.right==null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        if(left==0 || right==0){
            count++;
            return 1;
        }
        if(left==1 || right==1) return 2;
        return 0;

    }
    public int minCameraCover(TreeNode root) {
        return (solve(root)==0?1:0)+count;
    }
}