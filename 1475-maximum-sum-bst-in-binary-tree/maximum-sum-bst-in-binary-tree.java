class Node{
    int max;
    int min;
    int sum;
    Node(int max, int min, int sum){
        this.max = max;
        this.min = min;
        this.sum = sum;
    }
}
class Solution {
    int res = 0;
    public Node solve(TreeNode root){
        if(root==null) return new Node(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        Node left = solve(root.left);
        Node right = solve(root.right);
        if(root.val>left.max && root.val<right.min) {
            res = Math.max(res,root.val+left.sum+right.sum);
            return new Node(Math.max(root.val,right.max),Math.min(root.val,left.min),root.val+left.sum+right.sum);
        }
        return new Node(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
    }
    public int maxSumBST(TreeNode root) {
        solve(root);
        return res;
    }
}