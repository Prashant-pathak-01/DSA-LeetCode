class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<rooms.get(0).size(); i++) {
            queue.add(rooms.get(0).get(i));
        }
        while(!queue.isEmpty()){
            int temp = queue.poll();
            for(int i=0; i<rooms.get(temp).size(); i++){
                if(!set.contains(rooms.get(temp).get(i))){
                    queue.add(rooms.get(temp).get(i));
                }
            }
            set.add(temp);
        }
        set.add(0);
        return set.size()==rooms.size();
    }
}