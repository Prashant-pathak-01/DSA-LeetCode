class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int ch[] = new int[26];
        int count =0;
        int x = -1;
        boolean flag = false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=goal.charAt(i)){
                count++;
                if(x!=-1){
                    if(s.charAt(x)!=goal.charAt(i) || s.charAt(i)!=goal.charAt(x) ) return false;
                }else x = i;
            }
            ch[s.charAt(i)-'a']++;
            if(ch[s.charAt(i)-'a']==2) flag = true;
        }
        if(count==2) return true;
        else if(count==1 || count>2) return false;
        else return flag;
    }
}