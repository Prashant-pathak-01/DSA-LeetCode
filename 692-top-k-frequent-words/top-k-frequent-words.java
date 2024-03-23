class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<String []> pq = new PriorityQueue<>((a,b)->{
            if(Integer.parseInt(a[1])==Integer.parseInt(b[1])){
                return a[0].compareTo(b[0]);
            }else{
                return Integer.parseInt(b[1]) - Integer.parseInt(a[1]);
            }
        });
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(String key:map.keySet()){
            pq.add(new String[]{key,String.valueOf(map.get(key))});
        }
        List<String> list = new ArrayList<>();
        for(int i=0; i<k; i++){
            list.add(pq.poll()[0]);
        }
        return list;

    }
}