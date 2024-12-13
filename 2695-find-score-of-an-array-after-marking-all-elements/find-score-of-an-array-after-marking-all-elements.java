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
            if(nums[temp.index]>0){
                res+=temp.val;
                if(temp.index>0) nums[temp.index-1]=0;
                nums[temp.index]=0;
                if(temp.index+1<nums.length) nums[temp.index+1]=0;
            }
        }
        return res;
    }
}