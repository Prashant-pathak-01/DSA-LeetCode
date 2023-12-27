class Solution {
    public int totalFruit(int[] fruits) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int j = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<fruits.length; i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            set.add(fruits[i]);
            while(set.size()>2){
                map.put(fruits[j], map.get(fruits[j])-1);
                if(map.get(fruits[j])==0) set.remove(fruits[j]);
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        return res;
    }
}