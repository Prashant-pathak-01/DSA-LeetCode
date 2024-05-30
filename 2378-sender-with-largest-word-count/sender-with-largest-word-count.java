class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<senders.length; i++){
            int x = messages[i].split("\\s+").length;
            map.put(senders[i],map.getOrDefault(senders[i],0)+x);
        }
        int count =0;
        String res = "";
        for(String str:map.keySet()){
            if(map.get(str)>=count){
                if(map.get(str)==count) res = str.compareTo(res)>0?str:res; 
                else res = str;
                count = map.get(str);
            }
        }
        return res;

    }
}