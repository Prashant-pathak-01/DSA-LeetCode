class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==0) res++;
            else map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        for(int key:map.keySet()){
            res+=(key+1)*(int)Math.ceil((double)map.get(key)/(double)(key+1));
        }
        return res;
    }
}