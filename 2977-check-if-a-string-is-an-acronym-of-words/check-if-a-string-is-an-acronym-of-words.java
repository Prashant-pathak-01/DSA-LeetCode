class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size()) return false;
        for(int i=0; i<words.size(); i++) if(words.get(i).length()==0 || s.charAt(i)!=words.get(i).charAt(0)) return false;
    return true;

    }
}