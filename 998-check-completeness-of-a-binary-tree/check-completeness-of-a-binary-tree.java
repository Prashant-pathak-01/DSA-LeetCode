class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag  = true;
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left==null) flag = false;
            else {
                if(!flag) return false;
                q.add(temp.left);
            }
            if(temp.right==null) flag = false;
            else {
                if(!flag) return false;
                q.add(temp.right);
            }
        }
        return true;
    }
}