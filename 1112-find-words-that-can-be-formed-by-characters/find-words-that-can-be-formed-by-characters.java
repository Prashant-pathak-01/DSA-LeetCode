class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<chars.length(); i++){
            if(!map.containsKey(chars.charAt(i))){
                map.put(chars.charAt(i),1);
            } else{
                map.put(chars.charAt(i),map.get(chars.charAt(i))+1);
            }
        }
        int count = 0;
        for(int i=0; i<words.length; i++){
        Map<Character,Integer> hashmap = new HashMap<>();
            for(int j=0; j<words[i].length(); j++){
                if(!hashmap.containsKey(words[i].charAt(j))){
                    hashmap.put(words[i].charAt(j),1);
                }else{
                    hashmap.put(words[i].charAt(j),hashmap.get(words[i].charAt(j))+1);
                }
            }
            boolean temp = false;
            for(int j=0; j<words[i].length(); j++){
                if(!map.containsKey(words[i].charAt(j))){
                    temp = true;
                    break;
                }
                if(hashmap.get(words[i].charAt(j))>map.get(words[i].charAt(j))) {
                    temp = true;
                    break;
                }
            }
            if(!temp) count+=words[i].length();
        }
        return count;
    }
}