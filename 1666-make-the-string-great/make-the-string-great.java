class Solution {
    public String makeGood(String s) {
        boolean flag= true;
        while(flag){
            flag  = false;
            for(int i=0; i<s.length()-1; i++) {
                if(s.charAt(i)!=s.charAt(i+1) && Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(i+1))){
                    s = s.substring(0,i)+s.substring(i+2);
                    flag = true;
                    break;
                }
            }
        }
        return s;
    }
}