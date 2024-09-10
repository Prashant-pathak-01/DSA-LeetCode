class Solution {
    Map<Integer,List<Integer>> list;
    public void generateGraph(TreeNode root, TreeNode parent){
        if(root==null) return;
        List<Integer> temp = list.getOrDefault(root.val,new ArrayList<>());
        if(parent!=null) temp.add(parent.val);
        if(root.left!=null) temp.add(root.left.val);
        if(root.right!=null) temp.add(root.right.val);
        list.put(root.val,temp);
        generateGraph(root.left,root);
        generateGraph(root.right,root);

    }
    public void bfs(List<Integer> res, int tar,int k){
        Queue<Integer> q = new LinkedList<>();
        q.add(tar);
        boolean visited[] = new boolean[500];
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int temp = q.poll();
                visited[temp] = true;
                if(k==0) res.add(temp);
                for(int i=0; i<list.get(temp).size(); i++){
                    int x = list.get(temp).get(i);
                    if(!visited[x]){
                        q.add(x);
                    }
                }
            }
            k--;
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        list = new HashMap<>();
        generateGraph(root,null);
        List<Integer> res = new ArrayList<>();
        bfs(res,target.val,k);
        return res;
    }
}