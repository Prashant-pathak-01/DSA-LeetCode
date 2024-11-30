class Solution {
    class Pair{
        int index;
        String src;
        String tar;
        Pair(int i, String s, String t){
            index = i;
            src = s;
            tar = t;
        }
    }
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        if(indices.length<=0) return s;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.index-b.index);
        for(int i=0; i<targets.length; i++){
            pq.add(new Pair(indices[i],sources[i],targets[i]));
        }
        int i = 0;
        Pair temp = pq.poll();
        StringBuilder res = new StringBuilder();
        while(i<s.length()){
            if(temp!=null && i>temp.index && !pq.isEmpty()) temp = pq.poll();
            if(temp!=null && temp.index==i &&  s.length()>=i+temp.src.length() && s.substring(i,i+temp.src.length()).equals(temp.src)){

                //System.out.println(i+" "+temp.index);
                res.append(temp.tar);
                i+=temp.src.length();
                if(!pq.isEmpty()) temp = pq.poll();
                else temp = null;
            }else {
                if(temp!=null && !pq.isEmpty() && pq.peek().index==temp.index && temp.index==i) temp = pq.poll();
                else {
                    res.append(s.charAt(i));
                    i++;
                }
            }
        }
        return res.toString();

    }
}