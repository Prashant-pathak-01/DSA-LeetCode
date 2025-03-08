class Solution {
    public int countVowelSubstrings(String word) {
        int res= 0;
        for(int i=0; i<word.length(); i++){
            Set<Character> set = new HashSet<>();
            for(int j=i; j<word.length(); j++){
                if(word.charAt(j)=='a' || word.charAt(j)=='e' || word.charAt(j)=='i' || word.charAt(j)=='o' || word.charAt(j)=='u'){
                    set.add(word.charAt(j));
                }else break;
                if(set.size()==5) {
                    res++;
                }
            }
        }
        return res;
    }
}