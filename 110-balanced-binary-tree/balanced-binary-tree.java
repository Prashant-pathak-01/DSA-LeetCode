class Solution {
    Map<TreeNode,Integer> map = new HashMap<>();
    public int height(TreeNode root){
        if(root==null) return 0;
        int res= 1+Math.max(height(root.left),height(root.right));
        map.put(root,res);
        return res;
    }
    public boolean solve(TreeNode root){
        if(root==null) return true;
        int left = map.get(root.left);
        int right = map.get(root.right);
        if(Math.abs(left-right)>1) return false;
        return solve(root.left) && solve(root.right); 

    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        map.put(null,0);
        return solve(root);
    }
}