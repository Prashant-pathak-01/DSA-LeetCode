class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i=0; i<words2.length; i++){
            int arr[] = new int[26];
            for(int j=0; j<words2[i].length(); j++){
                arr[words2[i].charAt(j)-'a']++;
                if(map1.getOrDefault(words2[i].charAt(j),0)<arr[words2[i].charAt(j)-'a']){
                    map1.put(words2[i].charAt(j),arr[words2[i].charAt(j)-'a']);
                }
            }
        }
        List<String> list = new ArrayList<>();
        for(String str:words1){
            Map<Character,Integer> map2 = new HashMap<>();
            for(int i=0; i<str.length(); i++) map2.put(str.charAt(i),map2.getOrDefault(str.charAt(i),0)+1);
            boolean flag = true;
            for(char key:map1.keySet()){
                if(!map2.containsKey(key) || map2.get(key)<map1.get(key)){
                    flag = false;
                    break;
                }
            }
            if(flag) list.add(str);
            
        }
        return list;
    }
}