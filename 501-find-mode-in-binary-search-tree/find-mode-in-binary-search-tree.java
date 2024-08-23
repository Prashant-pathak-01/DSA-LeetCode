class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public void solve(TreeNode root){
        if(root==null) return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        solve(root.left);
        solve(root.right);
    }
    public int[] findMode(TreeNode root) {
        solve(root);
        int max = -1;
        for(int key:map.keySet()){
            max = Math.max(max,map.get(key));
        }
        List<Integer> list = new ArrayList<>();
        for(int key:map.keySet()){
            if(max==map.get(key)) list.add(key);
        }
        int res[] = new int[list.size()] ;
        for(int i=0; i<list.size(); i++) res[i] = list.get(i);
        return res;
    }
}