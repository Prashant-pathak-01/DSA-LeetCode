class Solution {
    class Pair{
        int val;
        long freq;
        Pair(int val, long freq){
            this.val = val;
            this.freq = freq;
        }
    }
    long MOD = (long)1e9+7;
    public int[] baseUnitConversions(int[][] conversions) {
        Map<Integer,List<Pair>> map = new HashMap<>();
        for(int i[]:conversions){
            List<Pair> list = map.getOrDefault(i[0],new ArrayList<>());
            list.add(new Pair(i[1],i[2]));
            map.put(i[0],list);
        }
        int res[] = new int[conversions.length+1];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,1));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            res[temp.val] = (int)temp.freq;
            for(Pair pair:map.getOrDefault(temp.val,new ArrayList<>())){
                q.add(new Pair(pair.val,(pair.freq*temp.freq)%MOD));
            }
        }
        return res;
    }
}