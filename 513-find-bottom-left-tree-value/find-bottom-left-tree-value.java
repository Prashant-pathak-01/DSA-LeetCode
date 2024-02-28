class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
        int res = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0; i<s; i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                if(i==0){
                    res = q.peek().val;
                }
                q.poll();
            }
        }
        return res;
    }

}