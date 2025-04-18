class Solution {
    List<String> res;
    Map<String, PriorityQueue<String>> map;
    public List<String> findItinerary(List<List<String>> tickets) {
        map = new HashMap<>();
        for(int i=0; i<tickets.size(); i++){
            PriorityQueue<String> pq = map.getOrDefault(tickets.get(i).get(0),new PriorityQueue<>());
            pq.add(tickets.get(i).get(1));
            map.put(tickets.get(i).get(0),pq);
        }
        res = new ArrayList<>();
        solve("JFK");
        Collections.reverse(res);
        return res;
    }
    public void solve(String start){
        PriorityQueue<String> pq = map.getOrDefault(start,new PriorityQueue<>());
        while(!pq.isEmpty()){
            solve(pq.poll());
        }
        res.add(start);
    }
}