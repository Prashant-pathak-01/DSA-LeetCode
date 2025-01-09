class Solution {
    public boolean check(String str, String tar){
        int i=0;
        int j=0;
        while(i<tar.length()){
            if(j==str.length()) return false;
            if(str.charAt(j)==tar.charAt(i)) {
                j++;
                i++;
            }
            else j++;
        }
        return true;
    }
    public String findLongestWord(String s, List<String> dictionary) {
        String res ="";
        for(String str:dictionary){
            if(str.length()>=res.length() && str.length()<=s.length() && check(s,str)){
                if(str.length()==res.length()) res = res.compareTo(str)>0?str:res;
                else res = str;
            }
        }
        return res;
    }
}