class Solution {
    class Pair{
        int index;
        int val;
        Pair(int i, int v){
            index = i;
            val = v;
        }
    }
    public long findScore(int[] nums) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.val==b.val?a.index-b.index:a.val-b.val);
        for(int i=0; i<nums.length; i++) pq.add(new Pair(i,nums[i]));
        Map<Integer,Pair> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        long res = 0;
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            //System.out.println(temp.x+" "+temp.y);
            if(!set.contains(temp.index)){
                res+=temp.val;
                set.add(temp.index-1);
                set.add(temp.index+1);
                set.add(temp.index);

            }
        }
        return res;
    }
}