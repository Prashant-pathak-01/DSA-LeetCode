class Solution {
    class Pair{
        int count;
        char ch;
        Pair(int x, char y){
            count = x;
            ch = y;
        }
    }
    public String repeatLimitedString(String s, int repeatLimit) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.ch-a.ch);
        for(char key:map.keySet()){
            pq.add(new Pair(map.get(key),key));
        }
        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            if(temp.count>repeatLimit){
                for(int i=0; i<repeatLimit; i++) res.append(temp.ch);
                temp.count-=repeatLimit;
                if(!pq.isEmpty()){
                    Pair temp2 = pq.poll();
                    res.append(temp2.ch);
                    temp2.count--;
                    if(temp2.count>0){
                        pq.add(temp2);
                    }
                    pq.add(temp);
                }
            }else{
                while(temp.count-->0) res.append(temp.ch);
            }
        }
        return res.toString();
    }
}