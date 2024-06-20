class Pair{
    int a;
    TreeNode b;
    Pair(int a,TreeNode b){
        this.a = a;
        this.b= b;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<Pair> q = new LinkedList<>();
        int res =0;
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            int size = q.size();
            res = Math.max(res,q.getLast().a-q.getFirst().a+1);
            for(int i=0; i<size; i++){
                Pair temp = q.poll();
                if(temp.b.left!=null) q.add(new Pair(2*temp.a,temp.b.left));
                if(temp.b.right!=null) q.add(new Pair(2*temp.a+1,temp.b.right));
            }
        }
        return res;
    }
}