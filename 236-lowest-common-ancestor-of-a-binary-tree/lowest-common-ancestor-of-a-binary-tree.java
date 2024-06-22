
class Solution {
    TreeNode res;
    public boolean contains(TreeNode root, TreeNode p, TreeNode q, int arr[]){
        if(root==null) return false;
        if(root==p) arr[0] = 1;
        if(root==q) arr[1] = 1;
        if(arr[0]==1 && arr[1]==1) return true;
        return contains(root.left,p,q,arr) || contains(root.right,p,q,arr);
    }
    public void solve(TreeNode root,TreeNode p, TreeNode q){
        if(root==null) return;
        res = root;
        if(contains(root.left,p,q,new int[2]) ) {
            solve(root.left,p,q);
        }else if(contains(root.right,p,q,new int[2])){
            solve(root.right,p,q);
        }else return;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        res = root;
        solve(root,p,q);
        return res;
    }
}