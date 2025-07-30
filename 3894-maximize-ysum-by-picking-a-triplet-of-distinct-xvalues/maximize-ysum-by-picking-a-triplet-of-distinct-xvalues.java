class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<x.length; i++){
            map.put(x[i],Math.max(map.getOrDefault(x[i],0),y[i]));
        }
        if(map.size()<3) return -1;
        int a = 0;
        int b = 0;
        int c = 0;
        for(int key:map.keySet()){
            if(map.get(key)>=a){
                c=b;
                b=a;
                a=map.get(key);
            }else if(map.get(key)>=b){
                c=b;
                b=map.get(key);
            }else if(map.get(key)>=c){
                c = map.get(key);
            }
        }
        return a+b+c;
    }
}