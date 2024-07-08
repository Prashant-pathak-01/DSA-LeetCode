class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++) q.add(i+1);
        int x =1;
        while(q.size()>1){
            if(x%k==0) q.poll();
            else q.add(q.poll());
            x++;
        }
        return q.poll();
    }
}