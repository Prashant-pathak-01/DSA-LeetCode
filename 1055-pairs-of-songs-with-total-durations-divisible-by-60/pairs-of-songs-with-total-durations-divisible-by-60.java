class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int res= 0;
        long count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<time.length; i++){
            time[i]%=60;
            if(time[i]==0) count++;
            else{
                res+=map.getOrDefault(60-time[i],0);
                map.put(time[i],map.getOrDefault(time[i],0)+1);
            }
        }
        res+=(count*(count-1))/2;
        return res;
    }
}