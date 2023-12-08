class Solution {
    public int countPrefixes(String[] words, String s) {
        int res = 0;
        for(int i=0; i<words.length; i++){
            int j= 0;
            if(words[i].length()<=s.length()){
            for(j=0; j<words[i].length(); j++){
                if(words[i].charAt(j)!=s.charAt(j)) break; 
            }
            }

            if(j==words[i].length()) res++;
        }
        return res;
    }
}