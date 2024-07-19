class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(char key:map.keySet()){
            pq.add(new int[]{key-'0',map.get(key)});
        }
        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()){
            int temp[] = pq.poll(); 
            for(int i=0; i<temp[1]; i++) res.append((char)(temp[0]+'0'));
        }
        return res.toString();
    }
}