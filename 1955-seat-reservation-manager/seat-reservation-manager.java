class SeatManager {
    PriorityQueue<Integer> q;
    public SeatManager(int n) {
        q = new PriorityQueue<>();
        for(int i=1; i<n+1; i++){
            q.offer(i);
        }      
    }
    
    public int reserve() {
        return (!q.isEmpty())? q.poll():-1;
    }
    
    public void unreserve(int seatNumber) {
        q.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */