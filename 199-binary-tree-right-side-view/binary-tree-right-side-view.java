class Solution {
    public void solve(TreeNode root, int i, List<Integer> list){
        if(root==null) return;
        if(i==list.size()) list.add(root.val);
        solve(root.right,i+1,list);
        solve(root.left,i+1,list);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        solve(root,0,list);
        return list;
    }
}