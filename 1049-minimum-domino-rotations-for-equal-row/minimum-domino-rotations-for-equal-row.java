class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = tops.length;
        for(int i=0; i<tops.length; i++){
            if(tops[i]!=bottoms[i]) map.put(bottoms[i],map.getOrDefault(bottoms[i],0)+1);
            map.put(tops[i],map.getOrDefault(tops[i],0)+1);
        }
        int max1 = -1;
        int max2 = -1;
        for( int key: map.keySet()){
            if(n==map.get(key)){
                if(max1==-1) max1 = key;
                else max2 = key;
            }
        }

        // System.out.println(map+" "+max1+" "+max2);
        if(max1==-1) return max1; 
        int res = Integer.MIN_VALUE;
        int count =0;
        for(int i:tops) if(i==max1) count++;
        res = Math.max(res,count);
        count =0;
        for(int i:bottoms) if(i==max1) count++;
        res = Math.max(res,count);
        count =0;

        if(max2!=-1){
            for(int i:tops) if(i==max2) count++;
            res = Math.max(res,count);
            count =0;
            for(int i:bottoms) if(i==max2) count++;
            res = Math.max(res,count);
            count =0;
        }

        return res==Integer.MIN_VALUE?-1:tops.length-res;

        
    }
}