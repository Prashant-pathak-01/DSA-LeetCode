class Solution {
    public long calculateScore(String s) {
        long res =0;
        Map<Character,List<Integer>> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char temp = (char)('a'+(25-(s.charAt(i)-'a')));
            if(map.containsKey(temp)){
                List<Integer> list = map.get(temp);
                int j = list.remove(list.size()-1);
                res+=i-j;
                if(list.size()==0) map.remove(temp);
                else map.put(temp,list);
            }else {
                List<Integer> list = map.getOrDefault(s.charAt(i),new ArrayList<>());
                list.add(i);
                map.put(s.charAt(i),list);
            }
        }
        return res;
    }
}