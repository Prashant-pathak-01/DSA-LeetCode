class Solution {
    public boolean isPair(String s1, String s2){
            if(s1.length()>s2.length()) return false;
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i)!=s2.charAt(i)) return false;
            }
            int b = s2.length()-1;
            for(int i=s1.length()-1;i>=0; i--){
                if(s1.charAt(i)!=s2.charAt(b--)) return false;
            }
            return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count  =0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if(isPair(words[i],words[j])) count++;
            }
        }
        return count;
    }
}