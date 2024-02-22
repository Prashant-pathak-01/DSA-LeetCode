class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length==0) return 1;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<trust.length; i++){
            if(!map.containsKey(trust[i][0])) map.put(trust[i][0],new ArrayList<>());
            map.get(trust[i][0]).add(trust[i][1]);
        }
        int res= -1;
        for(int i=0; i<trust.length; i++){
            if(res!=-1 && trust[i][1]!=res && !map.containsKey(trust[i][1])) return -1;
            if(!map.containsKey(trust[i][1])) res = trust[i][1];
        }
        for(int i=0; i<trust.length; i++){
            if(!map.get(trust[i][0]).contains(res)) return -1;
        }
        return res;
    }
}