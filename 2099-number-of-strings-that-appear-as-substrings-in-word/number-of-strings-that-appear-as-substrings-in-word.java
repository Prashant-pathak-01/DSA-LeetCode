class Solution {
    public int numOfStrings(String[] patterns, String word) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            for(int j=i; j<word.length()+1; j++){
                set.add(word.substring(i,j));
            }
        }
        int res = 0;
        for(int i=0; i<patterns.length; i++){
            if(set.contains(patterns[i])) res++;
        }
        return res;
    }
}