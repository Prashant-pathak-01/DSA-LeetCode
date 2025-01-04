class Solution {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String,Long> total = new HashMap<>();
        Map<String,Integer> max = new HashMap<>();
        for(int i=0; i<ids.length; i++){
            total.put(creators[i], total.getOrDefault(creators[i],0l)+views[i]);
            int temp = max.getOrDefault(creators[i],i);
            if(views[temp]<=views[i]){
                if(views[temp]==views[i]){
                    if(ids[temp].compareTo(ids[i])>0) max.put(creators[i],i);
                    else max.put(creators[i],temp);
                }else max.put(creators[i],i);
            }
        }
        //System.out.println(total);
        long maximum = -1;
        for(String key:total.keySet()) maximum = Math.max(maximum,total.get(key));
        List<List<String>> res = new ArrayList<>();
        for(String key:total.keySet()){
            if(maximum==total.get(key)){
                List<String> list = new ArrayList<>();
                list.add(key);
                list.add(ids[max.get(key)]);
                res.add(list);
            }
        }
        return res;
    }
}