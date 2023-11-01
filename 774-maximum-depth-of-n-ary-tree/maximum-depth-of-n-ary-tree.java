class Solution {
    public int maxDepth(Node root) {
        int count  =0 ;
        if(root ==null) return count;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Node temp = q.poll();
                for(Node j:temp.children){
                    if(q!=null) q.add(j);
                }
            }
            count++;
        }

        return count;
    }
}