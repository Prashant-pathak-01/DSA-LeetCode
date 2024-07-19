class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean key[] = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        key[0] = true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int temp= q.poll();
                key[temp] = true;
                for(int x:rooms.get(temp)){
                    if(!key[x]) q.add(x);
                }
            }
        }
        for(boolean i:key) if(!i) return false;
        return true;
    }
}