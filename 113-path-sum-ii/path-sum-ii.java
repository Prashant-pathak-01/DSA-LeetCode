class Solution {
    public void solve(TreeNode root, int tar, List<List<Integer>> list, List<Integer> temp){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            if(tar-root.val==0) {
                temp.add(root.val);
                list.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
            }
            return;
        }
        temp.add(root.val);
        solve(root.left,tar-root.val,list,temp);
        solve(root.right,tar-root.val,list,temp);
        temp.remove(temp.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        solve(root,targetSum,list,new ArrayList<>());
        return list;
    }
}