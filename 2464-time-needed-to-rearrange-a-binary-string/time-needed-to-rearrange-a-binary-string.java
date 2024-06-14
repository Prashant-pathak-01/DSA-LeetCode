class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int res =0 ;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=0; i<s.length()-1; i++){
                if(s.charAt(i)=='0' && s.charAt(i+1)=='1') {
                    flag =true;
                    s = s.substring(0,i)+"10"+s.substring(i+2);
                    i++;
                }

            }
            if(flag) res++;
        }
        return res;
    }
}