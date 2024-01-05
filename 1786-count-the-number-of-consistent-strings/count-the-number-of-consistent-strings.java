class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int res =0;
        for(int i=0; i<allowed.length(); i++) set.add(allowed.charAt(i));
        for(int i=0; i<words.length; i++){
            boolean temp = true;
            for(int j=0; j<words[i].length(); j++){
                if(!set.contains(words[i].charAt(j))){
                    temp = false;
                    break;
                }
            }
            if(temp) res++;
        }
        return res;
    }
}